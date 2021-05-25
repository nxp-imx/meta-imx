# Copyright 2020-2021 NXP
SUMMARY = "ARM Neural Network SDK"
DESCRIPTION = "Linux software and tools to enable machine learning workloads on power-efficient devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e14a924c16f7d828b8335a59da64074"

ARMNN_SRC ?= "git://source.codeaurora.org/external/imx/armnn-imx.git;protocol=https"
SRCBRANCH = "branches/armnn_21_02"

SRCREV = "f1f67cfa901acb0b83efa4db64cb506eb717a900" 

SRCREV_FORMAT = "armnn"

S = "${WORKDIR}/git"

inherit python3native
inherit cmake

SRC_URI = " \
    ${ARMNN_SRC};branch=${SRCBRANCH} \
"

DEPENDS = " \
    boost \
    protobuf \
    stb \
    half \
"
RDEPENDS_MX8       = ""
RDEPENDS_MX8_mx8   = "nn-imx"
RDEPENDS_MX8_mx8mm = ""
RDEPENDS_MX8_mx8mnul = ""
RDEPENDS_${PN}   = " \
    arm-compute-library \
    protobuf \
    boost \
    ${RDEPENDS_MX8} \
"
PACKAGECONFIG_VSI_NPU       = ""
PACKAGECONFIG_VSI_NPU_mx8   = "vsi-npu"
PACKAGECONFIG_VSI_NPU_mx8mm = ""
PACKAGECONFIG_VSI_NPU_mx8mnul = ""

PACKAGECONFIG ??= "neon ref caffe tensorflow tensorflow-lite onnx tests pyarmnn delegate ${PACKAGECONFIG_VSI_NPU}"

PACKAGECONFIG[caffe] = "-DBUILD_CAFFE_PARSER=1 -DCAFFE_GENERATED_SOURCES=${STAGING_DATADIR}/armnn-caffe-protobuf,-DBUILD_CAFFE_PARSER=0,armnn-caffe-protobuf"
PACKAGECONFIG[neon] = "-DARMCOMPUTENEON=1 -DARMCOMPUTE_LIBRARY_RELEASE=${STAGING_LIBDIR}/libarm_compute.so -DARMCOMPUTE_CORE_LIBRARY_RELEASE=${STAGING_LIBDIR}/libarm_compute_core.so,-DARMCOMPUTENEON=0,arm-compute-library"
PACKAGECONFIG[onnx] = "-DBUILD_ONNX_PARSER=1 -DONNX_GENERATED_SOURCES=${STAGING_DATADIR}/armnn-onnx-protobuf ,-DBUILD_ONNX_PARSER=0,armnn-onnx-protobuf"
PACKAGECONFIG[opencl] = "-DARMCOMPUTECL=1,-DARMCOMPUTECL=0,opencl-headers"
PACKAGECONFIG[tensorflow] = "-DBUILD_TF_PARSER=1 -DTF_GENERATED_SOURCES=${STAGING_DATADIR}/armnn-tensorflow-protobuf,-DBUILD_TF_PARSER=0, armnn-tensorflow-protobuf"
PACKAGECONFIG[tensorflow-lite] = "-DTF_LITE_SCHEMA_INCLUDE_PATH=${STAGING_DATADIR}/armnn-tensorflow-protobuf-lite -DTF_LITE_GENERATED_PATH=${STAGING_DATADIR}/armnn-tensorflow-protobuf-lite -DBUILD_TF_LITE_PARSER=1 ,-DBUILD_TF_LITE_PARSER=0, flatbuffers armnn-tensorflow-protobuf"
PACKAGECONFIG[unit-tests] = "-DBUILD_UNIT_TESTS=1,-DBUILD_UNIT_TESTS=0"
PACKAGECONFIG[tests] = "-DBUILD_TESTS=1,-DBUILD_TESTS=0"
PACKAGECONFIG[ref] = "-DARMNNREF=1,-DARMNNREF=0"
PACKAGECONFIG[vsi-npu] = "-DVSI_NPU=1,-DVSI_NPU=0,nn-imx"
PACKAGECONFIG[pyarmnn] = ",,armnn-swig-native python3-native python3-pip-native python3-wheel-native python3-setuptools-native"
PACKAGECONFIG[delegate] = "-DBUILD_ARMNN_TFLITE_DELEGATE=1 -DARMNN_SOURCE_DIR=${WORKDIR}/git -DTFLITE_INCLUDE_DIR=${STAGING_DATADIR}/armnn-tensorflow-lite -DTFLITE_LIB_DIR=${STAGING_DATADIR}/armnn-tensorflow-lite -DFLATBUFFERS_ROOT=${STAGING_DIR_HOST}/${prefix},-DBUILD_ARMNN_TFLITE_DELEGATE=0,flatbuffers armnn-tensorflow-protobuf armnn-tensorflow-lite"
EXTRA_OECMAKE += " \
    -DSHARED_BOOST=1 \
    -DHALF_INCLUDE=${STAGING_DIR_HOST} \
"

ARMNN_INSTALL_DIR = "${bindir}/${P}"
PYARMNN_INSTALL_DIR = "${ARMNN_INSTALL_DIR}/pyarmnn"

do_compile_append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'pyarmnn', 'true', 'false', d)}; then
        # copy required to link against pyarmnn wrappers
        # due to a bug in python/setuptools an explicit path cannot be set 
        # and default libdir must be used
        cp -Rf ${WORKDIR}/build/libarmnnTfParser.so* ${STAGING_LIBDIR}
        cp -Rf ${WORKDIR}/build/libarmnnTfLiteParser.so* ${STAGING_LIBDIR}
        cp -Rf ${WORKDIR}/build/libarmnnOnnxParser.so* ${STAGING_LIBDIR}
        cp -Rf ${WORKDIR}/build/libarmnnCaffeParser.so* ${STAGING_LIBDIR}
        cp -Rf ${WORKDIR}/build/libarmnn.so* ${STAGING_LIBDIR}

        export SWIG_EXECUTABLE=${STAGING_BINDIR_NATIVE}/swig
        export ARMNN_INCLUDE=${S}/include
        export ARMNN_LIB=${WORKDIR}/build

        cd ${S}/python/pyarmnn
        ${PYTHON} setup.py clean --all
        ${PYTHON} swig_generate.py -v
        ${PYTHON} setup.py build_ext --inplace
        ${PYTHON} setup.py bdist_wheel
    fi
}

do_install_append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'tests', 'true', 'false', d)}; then
        install -d ${D}${ARMNN_INSTALL_DIR}
        CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"        
        find ${WORKDIR}/build/tests -maxdepth 1 -type f -executable -exec cp $CP_ARGS {} ${D}${ARMNN_INSTALL_DIR} \;
        chrpath -d ${D}${ARMNN_INSTALL_DIR}/*
    fi

    if ${@bb.utils.contains('PACKAGECONFIG', 'pyarmnn', 'true', 'false', d)}; then
        export PIP_DISABLE_PIP_VERSION_CHECK=1
        export PIP_NO_CACHE_DIR=1
        install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
        ${STAGING_BINDIR_NATIVE}/pip3 install -v \
            -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-deps \
            ${S}/python/pyarmnn/dist/pyarmnn-*.whl
        find ${D}/${PYTHON_SITEPACKAGES_DIR} -type d -name "__pycache__" -exec rm -Rf {} +

        # pyarmnn examples for eiq
        cp -R ${S}/python/pyarmnn/examples ${D}${PYARMNN_INSTALL_DIR}
    fi
}

CXXFLAGS += "-fopenmp"
LIBS += "-larmpl_lp64_mp"

FILES_${PN} += "${libdir}/python*"
FILES_${PN} += "${PYARMNN_INSTALL_DIR}/examples*"
FILES_${PN}-dev += "${libdir}/ArmnnDelegateTargets-release.cmake ${libdir}/ArmnnDelegateConfig.cmake ${libdir}/ArmnnDelegateTargets.cmake"

# We support i.MX8 only (for now)
COMPATIBLE_MACHINE = "(mx8)"

# Ccache sometimes causes unexpected build break
CCACHE_DISABLE = '1'
