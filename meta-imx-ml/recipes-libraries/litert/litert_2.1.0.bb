# Copyright 2025-2026 NXP
DESCRIPTION = "Google's open-source high-performance runtime for on-device AI"
LICENSE = "Apache-2.0 & ${LICENSE_DEPS}"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    ${LIC_FILES_CHKSUM_DEPS} \
"


DEPENDS = "flatbuffers python3-numpy-native python3-pip-native python3-wheel-native unzip-native \
          python3 jpeg zlib litert-flatbuffers-native python3-pybind11 python3-numpy"

require litert-${PV}.inc

SRC_URI = "${LITERT_SRC};branch=${SRCBRANCH_litert};name=litert \
           ${SRC_URI_DEPS} \
"
SRCREV_FORMAT = "litert_${SRCREV_FORMAT_DEPS}"

inherit python3native cmake

PACKAGECONFIG ??= "${PACKAGECONFIG_GPU}"
PACKAGECONFIG_GPU              = ""
PACKAGECONFIG_GPU:mx95-nxp-bsp = "gpu"
PACKAGECONFIG[gpu] = "-DLITERT_ENABLE_GPU=on,-DLITERT_ENABLE_GPU=off, opencl-headers virtual/libopencl1,"

OECMAKE_SOURCEPATH = "${S}/litert"
TFLITE_BUILD_DIR ?= "${B}/tflite_build"
TFLITE_SOURCE_DIR ?= "${S}/tflite"

EXTRA_OECMAKE = " \
    -DLITERT_ENABLE_NPU=ON \
    -DTFLITE_BUILD_DIR=${TFLITE_BUILD_DIR} \
    -DTFLITE_HOST_TOOLS_DIR=${STAGING_BINDIR_NATIVE} \
    -DTFLITE_SOURCE_DIR=${TFLITE_SOURCE_DIR} \
    -DPYTHON_LIBRARY=${STAGING_LIBDIR}/lib${PYTHON_DIR}${PYTHON_ABI}.so \
    -DPYTHON_INCLUDE_DIR=${STAGING_INCDIR}/${PYTHON_DIR}${PYTHON_ABI} \
    -DPYBIND11_INCLUDE_DIR=${STAGING_INCDIR}/pybind11 \
    -DLITERT_AUTO_BUILD_TFLITE=OFF \
    -DLITERT_BUILD_PYTHON_BINDINGS=ON \
    -DLITERT_DISABLE_KLEIDIAI=OFF \
    ${DEPS_CMAKE_FLAGS} \
"

CXXFLAGS += "-fPIC -ffile-prefix-map=${WORKDIR}="

do_configure[network] = "1"

do_configure:prepend() {
    export FC=""

    # require to pull https://github.com/KhronosGroup/OpenCL-Headers
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}

    # ========================================================================
    # Step 1: Build TFLite with cmake overrides for offline mode
    # ========================================================================
    mkdir -p "${TFLITE_BUILD_DIR}"
    cd "${TFLITE_BUILD_DIR}"

    cmake \
        "${TFLITE_SOURCE_DIR}" \
        -DCMAKE_TOOLCHAIN_FILE:FILEPATH=${WORKDIR}/toolchain.cmake \
        -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
        -DTFLITE_HOST_TOOLS_DIR=${STAGING_BINDIR_NATIVE} \
        -DCMAKE_BUILD_TYPE=Release \
        -DTFLITE_ENABLE_XNNPACK=ON \
        -DTFLITE_ENABLE_GPU=${@bb.utils.contains('PACKAGECONFIG', 'gpu', 'ON', 'OFF', d)} \
        -DXNNPACK_ENABLE_KLEIDIAI=ON \
        -DXNNPACK_ENABLE_ARM_SME=OFF \
        -DXNNPACK_ENABLE_SME=OFF \
        -DPYTHON_LIBRARY=${STAGING_LIBDIR}/lib${PYTHON_DIR}${PYTHON_ABI}.so \
        -DPYTHON_INCLUDE_DIR=${STAGING_INCDIR}/${PYTHON_DIR}${PYTHON_ABI} \
        -DPYBIND11_INCLUDE_DIR=${STAGING_INCDIR}/pybind11 \
        -DNUMPY_INCLUDE_DIR=${STAGING_LIBDIR}/${PYTHON_DIR}${PYTHON_ABI}/site-packages/numpy/_core/include \
        ${DEPS_CMAKE_FLAGS}

    # Create symlinks for LiteRT cmake compatibility
    for dep in flatbuffers xnnpack cpuinfo fp16 fxdiv; do
        [ ! -d "${TFLITE_BUILD_DIR}/${dep}" ] && \
            ln -sf "${DEPS_DIR}/${dep}" "${TFLITE_BUILD_DIR}/${dep}"
    done
    # fp16 -> FP16-source (LiteRT references ${TFLITE_BUILD_DIR}/FP16-source/include)
    [ ! -d "${TFLITE_BUILD_DIR}/FP16-source" ] && \
        ln -sf "${DEPS_DIR}/fp16" "${TFLITE_BUILD_DIR}/FP16-source"
    # pthreadpool-source (LiteRT references ${TFLITE_BUILD_DIR}/pthreadpool-source/include)
    [ ! -d "${TFLITE_BUILD_DIR}/pthreadpool-source" ] && \
        ln -sf "${DEPS_DIR}/pthreadpool" "${TFLITE_BUILD_DIR}/pthreadpool-source"
    # pthreadpool/kleidiai: real dirs created by build, need include/ symlinks
    [ ! -d "${TFLITE_BUILD_DIR}/pthreadpool/include" ] && \
        ln -sf "${DEPS_DIR}/pthreadpool/include" "${TFLITE_BUILD_DIR}/pthreadpool/include"
    [ ! -d "${TFLITE_BUILD_DIR}/kleidiai/include" ] && \
        ln -sf "${DEPS_DIR}/kleidiai/kai" "${TFLITE_BUILD_DIR}/kleidiai/include"

    # Fix FlatBuffers version mismatch in generated headers
    find "${DEPS_DIR}/tensorflow" -name "*_generated.h" -type f | while read hdr; do
        if grep -q "FLATBUFFERS_VERSION_MAJOR == 24" "$hdr" 2>/dev/null; then
            sed -i \
                -e 's/FLATBUFFERS_VERSION_MAJOR == 24/FLATBUFFERS_VERSION_MAJOR == 25/g' \
                -e 's/FLATBUFFERS_VERSION_MINOR == [0-9]*/FLATBUFFERS_VERSION_MINOR == 9/g' \
                -e 's/FLATBUFFERS_VERSION_REVISION == [0-9]*/FLATBUFFERS_VERSION_REVISION == 23/g' \
                "$hdr"
        fi
    done

    # Overlay LiteRT converter sources
    OVERLAY_ROOT="${S}/tflite/converter"
    OVERLAY_FILES="\
        allocation.h:tensorflow/compiler/mlir/lite/allocation.h \
        mmap_allocation.cc:tensorflow/compiler/mlir/lite/mmap_allocation.cc \
        mmap_allocation_disabled.cc:tensorflow/compiler/mlir/lite/mmap_allocation_disabled.cc \
        core/model_builder_base.cc:tensorflow/compiler/mlir/lite/core/model_builder_base.cc \
        core/model_builder_base.h:tensorflow/compiler/mlir/lite/core/model_builder_base.h \
    "
    for item in ${OVERLAY_FILES}; do
        src_path="${OVERLAY_ROOT}/${item%%:*}"
        dst_path="${DEPS_DIR}/tensorflow/${item#*:}"
        mkdir -p "$(dirname "${dst_path}")"
        sed -e 's|"tflite/converter/|"tensorflow/compiler/mlir/lite/|g' \
            -e 's|<tflite/converter/|<tensorflow/compiler/mlir/lite/|g' \
            "${src_path}" > "${dst_path}"
    done

    # Build TFLite
    cmake --build . --target tensorflow-lite -- ${PARALLEL_MAKE}

    # Build Python wrappers
    PY_WRAPS="_pywrap_tensorflow_interpreter_wrapper \
              _pywrap_analyzer_wrapper \
              _pywrap_modify_model_interface \
              format_converter_wrapper_pybind11 \
              pywrap_genai_ops \
    "
    for w in ${PY_WRAPS}; do
        cmake --build . --target $w -- ${PARALLEL_MAKE}
    done

    cd "${B}"
}

do_compile:append () {
    cd ${B}
    ${S}/build_wheel_package.sh ${B} -s ${S} -p linux_${TARGET_ARCH} -P ${PYTHON}
}

do_install() {
    cd ${B}
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -vvv --platform linux_${TARGET_ARCH} \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${B}/install/ai_edge_litert-*.whl

    sed -i "s#${WORKDIR}#/workdir#g" \
        ${D}/${PYTHON_SITEPACKAGES_DIR}/ai_edge_litert-${PV}+arm64.dist-info/direct_url.json

    chown -R root:root ${D}
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN}   = " \
    python3 \
    python3-numpy \
"

INSANE_SKIP:${PN} += "dev-deps"

SSTATE_ALLOW_OVERLAP_FILES = "/"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

FILES:${PN} += "${libdir}/python*"
