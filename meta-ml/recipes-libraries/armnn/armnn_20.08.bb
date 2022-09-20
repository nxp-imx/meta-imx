SUMMARY = "ARM Neural Network SDK"
DESCRIPTION = "Linux software and tools to enable machine learning (Caffe/Tensorflow) workloads on power-efficient devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e14a924c16f7d828b8335a59da64074"

ARMNN_SRC ?= "git://github.com/nxp-imx/armnn-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.y_1.0.0"

SRCREV = "a9de15b5faed05dfa8f94030060bac1e0df0f21d" 

SRCREV_FORMAT = "armnn"

S = "${WORKDIR}/git"

inherit python3native
inherit cmake

SRC_URI = " \
    ${ARMNN_SRC};branch=${SRCBRANCH} \
    file://0001-AIR-3570_pyarmnn-yocto-cross-compile.patch \
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
RDEPENDS_MX8_mx8mnlite = ""
RDEPENDS_${PN}   = " \
    arm-compute-library \
    protobuf \
    boost \
    ${RDEPENDS_MX8} \
"
PACKAGECONFIG_VSI_NPU       = ""
PACKAGECONFIG_VSI_NPU_mx8   = "vsi-npu"
PACKAGECONFIG_VSI_NPU_mx8mm = ""
PACKAGECONFIG_VSI_NPU_mx8mnlite = ""

PACKAGECONFIG ??= "neon ref caffe tensorflow tensorflow-lite onnx tests pyarmnn ${PACKAGECONFIG_VSI_NPU}"

PACKAGECONFIG[caffe] = "-DBUILD_CAFFE_PARSER=1 -DCAFFE_GENERATED_SOURCES=${STAGING_DATADIR}/armnn-caffe,-DBUILD_CAFFE_PARSER=0,armnn-caffe"
PACKAGECONFIG[neon] = "-DARMCOMPUTENEON=1 -DARMCOMPUTE_LIBRARY_RELEASE=${STAGING_LIBDIR}/libarm_compute.so -DARMCOMPUTE_CORE_LIBRARY_RELEASE=${STAGING_LIBDIR}/libarm_compute_core.so,-DARMCOMPUTENEON=0,arm-compute-library"
PACKAGECONFIG[onnx] = "-DBUILD_ONNX_PARSER=1 -DONNX_GENERATED_SOURCES=${STAGING_DATADIR}/armnn-onnx ,-DBUILD_ONNX_PARSER=0,armnn-onnx"
PACKAGECONFIG[opencl] = "-DARMCOMPUTECL=1,-DARMCOMPUTECL=0,opencl-headers"
PACKAGECONFIG[tensorflow] = "-DBUILD_TF_PARSER=1 -DTF_GENERATED_SOURCES=${STAGING_DATADIR}/armnn-tensorflow,-DBUILD_TF_PARSER=0, armnn-tensorflow "
PACKAGECONFIG[tensorflow-lite] = "-DTF_LITE_SCHEMA_INCLUDE_PATH=${STAGING_DATADIR}/armnn-tensorflow-lite -DTF_LITE_GENERATED_PATH=${STAGING_DATADIR}/armnn-tensorflow-lite -DBUILD_TF_LITE_PARSER=1 ,-DBUILD_TF_LITE_PARSER=0, flatbuffers armnn-tensorflow"
PACKAGECONFIG[unit-tests] = "-DBUILD_UNIT_TESTS=1,-DBUILD_UNIT_TESTS=0"
PACKAGECONFIG[tests] = "-DBUILD_TESTS=1,-DBUILD_TESTS=0"
PACKAGECONFIG[ref] = "-DARMNNREF=1,-DARMNNREF=0"
PACKAGECONFIG[vsi-npu] = "-DVSI_NPU=1,-DVSI_NPU=0,nn-imx"
PACKAGECONFIG[pyarmnn] = ",,armnn-swig-native python3-native python3-pip-native python3-wheel-native python3-setuptools-native"

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

# We support i.MX8 only (for now)
COMPATIBLE_MACHINE = "(mx8)"
