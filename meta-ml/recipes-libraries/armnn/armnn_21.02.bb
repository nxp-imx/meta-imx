# Copyright 2020-2021 NXP
SUMMARY = "ARM Neural Network SDK"
DESCRIPTION = "Linux software and tools to enable machine learning workloads on power-efficient devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e14a924c16f7d828b8335a59da64074"

ARMNN_SRC ?= "git://github.com/nxp-imx/armnn-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.52_2.1.0"

SRCREV = "c1940970e79a36cce0356f36dda7ae750d401d5c"

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
RDEPENDS_MX8_mx8ulp = ""
RDEPENDS_${PN}   = " \
    arm-compute-library \
    protobuf \
    boost \
    ${RDEPENDS_MX8} \
"
PACKAGECONFIG_VSI_NPU       = ""
PACKAGECONFIG_VSI_NPU_mx8   = "vsi-npu tim-vx"
PACKAGECONFIG_VSI_NPU_mx8mm = ""
PACKAGECONFIG_VSI_NPU_mx8mnul = ""
PACKAGECONFIG_VSI_NPU_mx8ulp = ""

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
PACKAGECONFIG[delegate] = "-DBUILD_ARMNN_TFLITE_DELEGATE=1 -DARMNN_SOURCE_DIR=${WORKDIR}/git -DTFLITE_INCLUDE_DIR=${STAGING_INCDIR} -DTFLITE_LIB_DIR=${STAGING_LIBDIR} -DFLATBUFFERS_ROOT=${STAGING_DIR_HOST}/${prefix},-DBUILD_ARMNN_TFLITE_DELEGATE=0,flatbuffers armnn-tensorflow-protobuf tensorflow-lite"
# tim-vx is required by the delegate on VSI NPU platforms
PACKAGECONFIG[tim-vx] = ",,tim-vx"
EXTRA_OECMAKE += " \
    -DSHARED_BOOST=1 \
    -DHALF_INCLUDE=${STAGING_DIR_HOST} \
"

ARMNN_INSTALL_DIR = "${bindir}/${P}"
DELEGATE_INSTALL_DIR = "${ARMNN_INSTALL_DIR}/delegate"
DELEGATE_INCLUDE_DIR = "${includedir}/armnn/delegate"
PYARMNN_INSTALL_DIR = "${ARMNN_INSTALL_DIR}/pyarmnn"
PYARMNN_GENERATED_DIR = "${PYTHON_SITEPACKAGES_DIR}/pyarmnn/_generated"

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
    CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
    if ${@bb.utils.contains('PACKAGECONFIG', 'tests', 'true', 'false', d)}; then
        install -d ${D}${ARMNN_INSTALL_DIR}
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
                
        # remove x86 suffix cpython for cross-compiled shared libs to link them universally
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn.*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn.so
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_caffeparser.*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_caffeparser.so
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_deserializer.*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_deserializer.so
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_onnxparser.*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_onnxparser.so
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_tfliteparser.*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_tfliteparser.so
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_tfparser.*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_tfparser.so
        mv ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_version*.so ${D}/${PYARMNN_GENERATED_DIR}/_pyarmnn_version.so
        
        # pyarmnn examples for eiq
        cp $CP_ARGS ${S}/python/pyarmnn/examples ${D}${PYARMNN_INSTALL_DIR}
    fi
    
    if ${@bb.utils.contains('PACKAGECONFIG', 'delegate', 'true', 'false', d)}; then
        # Arm NN delegate header files
        install -d ${D}${DELEGATE_INCLUDE_DIR}
        cp $CP_ARGS ${S}/delegate/include/* ${D}${DELEGATE_INCLUDE_DIR}
        
        # example application (source code + README)
        install -d ${D}${DELEGATE_INSTALL_DIR}
        cp $CP_ARGS ${S}/delegate/samples/* ${D}${DELEGATE_INSTALL_DIR}
    fi
}

CXXFLAGS += "-fopenmp"
LIBS += "-larmpl_lp64_mp"

FILES_${PN} += "${libdir}/python*"
FILES_${PN} += "${PYARMNN_INSTALL_DIR}/examples*"
FILES_${PN}-dev += "${DELEGATE_INSTALL_DIR}/*"
FILES_${PN}-dev += "${libdir}/ArmnnDelegateTargets-release.cmake ${libdir}/ArmnnDelegateConfig.cmake ${libdir}/ArmnnDelegateTargets.cmake"

# We support i.MX8 only (for now)
COMPATIBLE_MACHINE = "(mx8)"

# Ccache sometimes causes unexpected build break
CCACHE_DISABLE = '1'
