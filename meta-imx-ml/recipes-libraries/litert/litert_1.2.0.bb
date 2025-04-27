# Copyright 2025 NXP
DESCRIPTION = "Google's open-source high-performance runtime for on-device AI"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"


DEPENDS = "flatbuffers python3-numpy-native python3-pip-native python3-pybind11-native python3-wheel-native unzip-native \
    python3 jpeg zlib tensorflow-lite-host-tools-native"

require litert-${PV}.inc
SRC_URI = "${LITERT_SRC};branch=${SRCBRANCH_litert};name=litert"

SRC_URI += "https://storage.googleapis.com/download.tensorflow.org/models/mobilenet_v1_2018_08_02/mobilenet_v1_1.0_224_quant.tgz;name=model-mobv1"
SRC_URI[model-mobv1.sha256sum] = "d32432d28673a936b2d6281ab0600c71cf7226dfe4cdcef3012555f691744166"

S = "${WORKDIR}/git"

inherit python3native cmake

PACKAGECONFIG ??= "python-example ${PACKAGECONFIG_GPU_DELEGATE}"
PACKAGECONFIG_GPU_DELEGATE              = ""
PACKAGECONFIG_GPU_DELEGATE:mx95-nxp-bsp = "gpu-delegate"

PACKAGECONFIG[gpu-delegate] = "-DTFLITE_ENABLE_GPU=on,-DTFLITE_ENABLE_GPU=off"
PACKAGECONFIG[python-example] = ",,,python3-pillow"

EXTRA_OECMAKE = " \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
    -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
    -DTFLITE_HOST_TOOLS_DIR=${STAGING_BINDIR_NATIVE} \
    -DTFLITE_ENABLE_NNAPI=off \
    -DTFLITE_ENABLE_NNAPI_VERBOSE_VALIDATION=on \
    -DTFLITE_ENABLE_RUY=on \
    -DTFLITE_ENABLE_XNNPACK=on \
    -DTFLITE_ENABLE_EXTERNAL_DELEGATE=on \
    -DTFLITE_PYTHON_WRAPPER_BUILD=on \
    ${S}/tflite/ \
"

CXXFLAGS += "-fPIC -ffile-prefix-map=${WORKDIR}="

do_configure[network] = "1"
do_configure:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}

    # There is no Fortran compiler in the toolchain, but bitbake sets this variable anyway
    # with unavailable binary.
    export FC=""
}


do_compile:append () {
    # build pip package
    cd ${B}
    CI_BUILD_PYTHON=${PYTHON} BUILD_NUM_JOBS=8 ${S}/tflite/tools/pip_package/build_pip_package_with_cmake_yocto.sh ${TARGET_ARCH}
}

do_install() {
    # Install pip package
    install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
    ${STAGING_BINDIR_NATIVE}/pip3 install --disable-pip-version-check -vvv --platform linux_${TARGET_ARCH} \
        -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-cache-dir --no-deps \
        ${B}/litert_pip/dist/ai_edge_litert-*.whl

    # remove the build host info to improve reproducibility
    sed -i "s#${WORKDIR}#/workdir#g" \
        ${D}/${PYTHON_SITEPACKAGES_DIR}/ai_edge_litert-${PV}.dist-info/direct_url.json
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN}   = " \
    python3 \
    python3-numpy \
    ${RDEPENDS_OPENCL} \
"
RDEPENDS_OPENCL               = "opencl-icd-loader-dev"
RDEPENDS_OPENCL:mx8mm-nxp-bsp = ""

INSANE_SKIP:${PN} += "dev-deps"

# TensorFlow and TensorFlow Lite both exports few files, suppress the error
SSTATE_ALLOW_OVERLAP_FILES = "/"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

FILES:${PN} += "${libdir}/python*"
