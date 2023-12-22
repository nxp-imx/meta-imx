# Copyright 2020-2023 NXP
DESCRIPTION = "cross-platform, high performance scoring engine for ML models"
SECTION = "devel"
LICENSE = "MIT & Apache-2.0"
LIC_FILES_CHKSUM_runtime = "file://LICENSE;md5=0f7e3b1308cb5c00b372a6e78835732d"
LIC_FILES_CHKSUM_model = "file://${S}/example-models/squeezenet/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
LIC_FILES_CHKSUM = "${LIC_FILES_CHKSUM_runtime} ${LIC_FILES_CHKSUM_model}"

DEPENDS = "libpng zlib"

inherit setuptools3

SRC_URI = "${ONNXRUNTIME_SRC};branch=${SRCBRANCH}"
ONNXRUNTIME_SRC ?= "gitsm://github.com/nxp-imx/onnxruntime-imx.git;protocol=https"
SRCBRANCH = "lf-6.6.3_1.0.0"
SRCREV = "1582e774d7c120a5dfbdbf6e11c8788e710ab93f" 

S = "${WORKDIR}/git"

inherit cmake python3native

OECMAKE_SOURCEPATH = "${S}/cmake"
OECMAKE_GENERATOR = "Unix Makefiles"

# Notes:
# Abseil:
#   - FETCHCONTENT_FULLY_DISCONNECTED=OFF and do_configure:prepend() added to allow
#     abseil build process (the issue was related to CMake not fetching sources)

EXTRA_OECMAKE += "\
    -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
    -DCMAKE_BUILD_TYPE=RelWithDebInfo \
    -Donnxruntime_BUILD_UNIT_TESTS=ON \
"

PYTHON_DEPENDS = "\
    ${PYTHON_PN} \
    ${PYTHON_PN}-pip-native \
    ${PYTHON_PN}-numpy-native \
    ${PYTHON_PN}-packaging-native\
    ${PYTHON_PN}-pybind11\
    ${PYTHON_PN}-pybind11-native\
"

PYTHON_RDEPENDS = "\
    ${PYTHON_PN} \
    ${PYTHON_PN}-numpy \
    ${PYTHON_PN}-protobuf \
    ${PYTHON_PN}-coloredlogs \
    ${PYTHON_PN}-flatbuffers \
    ${PYTHON_PN}-sympy \
"

PACKAGECONFIG ?= "crosscompiling sharedlib python"

PACKAGECONFIG[nsync] = "-Donnxruntime_USE_NSYNC=ON, -Donnxruntime_USE_NSYNC=OFF"
PACKAGECONFIG[prebuilt] = "-Donnxruntime_USE_PREBUILT_PB=ON, -Donnxruntime_USE_PREBUILT_PB=OFF"
PACKAGECONFIG[openmp] = "-Donnxruntime_USE_OPENMP=ON, -Donnxruntime_USE_OPENMP=OFF"
PACKAGECONFIG[trt] = "-Donnxruntime_USE_TRT=ON, -Donnxruntime_USE_TRT=OFF"
PACKAGECONFIG[nuphar] = "-Donnxruntime_USE_NUPHAR=ON, -Donnxruntime_USE_NUPHAR=OFF"
PACKAGECONFIG[brainslice] = "-Donnxruntime_USE_BRAINSLICE=ON, -Donnxruntime_USE_BRAINSLICE=OFF"
PACKAGECONFIG[python] = "-Donnxruntime_ENABLE_PYTHON=ON, -Donnxruntime_ENABLE_PYTHON=OFF, ${PYTHON_DEPENDS}, ${PYTHON_RDEPENDS}"
PACKAGECONFIG[sharedlib] = "-Donnxruntime_BUILD_SHARED_LIB=ON, -Donnxruntime_BUILD_SHARED_LIB=OFF"
PACKAGECONFIG[eigenblas] = "-Donnxruntime_USE_EIGEN_FOR_BLAS=ON, -Donnxruntime_USE_EIGEN_FOR_BLAS=OFF"
PACKAGECONFIG[openblas] = "-Donnxruntime_USE_OPENBLAS=ON, -Donnxruntime_USE_OPENBLAS=OFF"
PACKAGECONFIG[dnnl] = "-Donnxruntime_USE_DNNL=ON, -Donnxruntime_USE_DNNL=OFF"
PACKAGECONFIG[mklml] = "-Donnxruntime_USE_MKLML=ON, -Donnxruntime_USE_MKLML=OFF"
PACKAGECONFIG[gemmlowp] = "-Donnxruntime_USE_GEMMLOWP=ON, -Donnxruntime_USE_GEMMLOWP=OFF"
PACKAGECONFIG[ngraph] = "-Donnxruntime_USE_NGRAPH=ON, -Donnxruntime_USE_NGRAPH=OFF"
PACKAGECONFIG[openvino] = "-Donnxruntime_USE_OPENVINO=ON, -Donnxruntime_USE_OPENVINO=OFF"
PACKAGECONFIG[interop] = "-Donnxruntime_ENABLE_LANGUAGE_INTEROP_OPS=ON, -Donnxruntime_ENABLE_LANGUAGE_INTEROP_OPS=OFF"
PACKAGECONFIG[dml] = "-Donnxruntime_USE_DML=ON, -Donnxruntime_USE_DML=OFF"
PACKAGECONFIG[telemetry] = "-Donnxruntime_USE_TELEMETRY=ON, -Donnxruntime_USE_TELEMETRY=OFF"
PACKAGECONFIG[armnn-relu] = "-Donnxruntime_ARMNN_RELU_USE_CPU=ON, -Donnxruntime_ARMNN_RELU_USE_CPU=OFF"
PACKAGECONFIG[armnn-bn] = "-Donnxruntime_ARMNN_BN_USE_CPU=ON, -Donnxruntime_ARMNN_BN_USE_CPU=OFF"
PACKAGECONFIG[opschema] = "-Donnxruntime_PYBIND_EXPORT_OPSCHEMA=ON, -Donnxruntime_PYBIND_EXPORT_OPSCHEMA=OFF"
PACKAGECONFIG[nnapi] = "-Donnxruntime_USE_NNAPI_BUILTIN=ON, -Donnxruntime_USE_NNAPI_BUILTIN=OFF"
PACKAGECONFIG[tvm] = "-Donnxruntime_USE_TVM=ON, -Donnxruntime_USE_TVM=OFF"
PACKAGECONFIG[llvm] = "-Donnxruntime_USE_LLVM=ON, -Donnxruntime_USE_LLVM=OFF"
PACKAGECONFIG[microsoft] = "-Donnxruntime_ENABLE_MICROSOFT_INTERNAL=ON, -Donnxruntime_ENABLE_MICROSOFT_INTERNAL=OFF"
PACKAGECONFIG[eigenthreadpool] = "-Donnxruntime_USE_EIGEN_THREADPOOL=ON, -Donnxruntime_USE_EIGEN_THREADPOOL=OFF"
PACKAGECONFIG[tensorrt] = "-Donnxruntime_USE_TENSORRT=ON, -Donnxruntime_USE_TENSORRT=OFF"
PACKAGECONFIG[crosscompiling] = "-Donnxruntime_CROSS_COMPILING=ON, -Donnxruntime_CROSS_COMPILING=OFF "
PACKAGECONFIG[server] = "-Donnxruntime_BUILD_SERVER=ON, -Donnxruntime_BUILD_SERVER=OFF"
PACKAGECONFIG[x86] = "-Donnxruntime_BUILD:x86=ON, -Donnxruntime_BUILD:x86=OFF"
PACKAGECONFIG[fullprotobuf] = "-Donnxruntime_USE_FULL_PROTOBUF=ON, -Donnxruntime_USE_FULL_PROTOBUF=OFF"
PACKAGECONFIG[ops] = "-Donnxruntime_DISABLE_CONTRIB_OPS=ON, -Donnxruntime_DISABLE_CONTRIB_OPS=OFF"
PACKAGECONFIG[staticruntime] = "-Donnxruntime_MSVC_STATIC_RUNTIME=ON, -Donnxruntime_MSVC_STATIC_RUNTIME=OFF"
PACKAGECONFIG[runtests] = "-Donnxruntime_RUN_ONNX_TESTS=ON, -Donnxruntime_RUN_ONNX_TESTS=OFF"
PACKAGECONFIG[reports] = "-Donnxruntime_GENERATE_TEST_REPORTS=ON, -Donnxruntime_GENERATE_TEST_REPORTS=OFF"
PACKAGECONFIG[devmode] = "-Donnxruntime_DEV_MODE=ON, -Donnxruntime_DEV_MODE=OFF"
PACKAGECONFIG[cuda] = "-Donnxruntime_USE_CUDA=ON, -Donnxruntime_USE_CUDA=OFF"
PACKAGECONFIG[automl] = "-Donnxruntime_USE_AUTOML=ON, -Donnxruntime_USE_AUTOML=OFF"
PACKAGECONFIG[jemalloc] = "-Donnxruntime_USE_JEMALLOC=ON, -Donnxruntime_USE_JEMALLOC=OFF"
PACKAGECONFIG[mimalloc] = "-Donnxruntime_USE_MIMALLOC=ON, -Donnxruntime_USE_MIMALLOC=OFF"
PACKAGECONFIG[csharp] = "-Donnxruntime_BUILD_CSHARP=ON, -Donnxruntime_BUILD_CSHARP=OFF"
PACKAGECONFIG[java] = "-Donnxruntime_BUILD_JAVA=ON, -Donnxruntime_BUILD_JAVA=OFF"

do_configure[network] = "1"
do_configure:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}

do_compile[network] = "1"
do_compile:prepend() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'python', 'true', 'false', d)}; then
        # required to pull pybind11
        export HTTP_PROXY=${http_proxy}
        export HTTPS_PROXY=${https_proxy}
        export http_proxy=${http_proxy}
        export https_proxy=${https_proxy}
    fi
}

SETUPTOOLS_SETUP_PATH = "${B}"

do_compile:append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'python', 'true', 'false', d)}; then
        # Copy 'setup.py' to build dir
        cp ${S}/setup.py ${B}

        # Copy path file with path 'docs/python/README.rst' to build dir
        mkdir -p ${B}/docs/python && cp ${S}/docs/python/README.rst ${B}/docs/python
        
        setuptools3_do_compile
        
        git config --global --add safe.directory ${WORKDIR}/build/pybind11/src/pybind11
    fi
}

do_install:append() {
    CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
    
    # Ensure target dir exists
    install -d ${D}${bindir}/${BP}

    # Copy squeezenet updated model from imx-onnxruntime repo
    if [ -d ${S}/example-models/ ]; then
        cp $CP_ARGS ${S}/example-models/squeezenet ${D}${bindir}/${BP}/
    fi

    # If cmake installs 'onnx_test_runner' at bindir level, move to package
    if [ -f ${D}${bindir}/onnx_test_runner ]; then
        mv ${D}${bindir}/onnx_test_runner ${D}${bindir}/${BP}/
    fi

    # Install onnxruntime_perf_test in main package
    install -m 0755 ${B}/onnxruntime_perf_test ${D}${bindir}/${BP}

    # Install test binaries and data in test package
    install -d ${D}${bindir}/${BP}/tests
    install -m 0744 ${B}/libcustom_op_library.so ${D}${bindir}/${BP}/tests
    install -m 0744 ${B}/onnxruntime_global_thread_pools_test ${D}${bindir}/${BP}/tests
    install -m 0744 ${B}/onnxruntime_mlas_test ${D}${bindir}/${BP}/tests
    install -m 0744 ${B}/onnxruntime_shared_lib_test ${D}${bindir}/${BP}/tests
    install -m 0744 ${B}/onnxruntime_test_all ${D}${bindir}/${BP}/tests
    cp $CP_ARGS ${B}/testdata ${D}${bindir}/${BP}/tests

    if ${@bb.utils.contains('PACKAGECONFIG', 'python', 'true', 'false', d)}; then
        setuptools3_do_install
        find ${D}/${PYTHON_SITEPACKAGES_DIR} -type d -name "__pycache__" -exec rm -Rf {} +
        git config --global --unset-all safe.directory ${TMPDIR}/.*/${PN}/.*/build/pybind11/src/pybind11
    fi
}

# Adjust the Python runtime dependency inherited from setuptools3-base.bbclass
# since Python support for this recipe is conditional
RDEPENDS:${PN}:remove:class-target = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'python', '', '${PYTHON_PN}-core', d)}"

# libonnxruntime_providers_shared.so is being packaged into -dev which is intended
INSANE_SKIP:${PN}-dev += "dev-elf"

# A separate tests package for the test binaries not appearing in the main package
PACKAGE_BEFORE_PN = "${PN}-tests"
FILES:${PN}-tests = "${bindir}/${BP}/tests/*"

# libcustom_op_library.so is in bindir, which is intended;
# onnxruntime_shared_lib_test requires the shlib to be in the same directory as testdata to run properly
INSANE_SKIP:${PN}-tests += "libdir"
INSANE_SKIP:${PN}-dbg += "libdir"
