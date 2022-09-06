# Copyright 2020-2022 NXP
DESCRIPTION = "cross-platform, high performance scoring engine for ML models"
SECTION = "devel"
LICENSE = "MIT & Apache-2.0"
LIC_FILES_CHKSUM_runtime = "file://LICENSE;md5=0f7e3b1308cb5c00b372a6e78835732d"
LIC_FILES_CHKSUM_model = "file://${WORKDIR}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
LIC_FILES_CHKSUM = "${LIC_FILES_CHKSUM_runtime} ${LIC_FILES_CHKSUM_model}"

DEPENDS = "libpng zlib ${BPN}-native"

ONNXRUNTIME_SRC ?= "gitsm://github.com/nxp-imx/onnxruntime-imx.git;protocol=https"
SRCBRANCH_runtime = "lf-5.15.32_2.0.0"
SRC_URI = " \
    ${ONNXRUNTIME_SRC};branch=${SRCBRANCH_runtime};name=runtime \
    https://github.com/onnx/models/raw/${SRCREV_model}/LICENSE;name=model-license \
    https://github.com/onnx/models/raw/${SRCREV_model}/vision/classification/squeezenet/model/squeezenet1.0-9.tar.gz;name=model-squeezenet \
"
SRC_URI[model-license.md5sum] = "3b83ef96387f14655fc854ddc3c6bd57"
SRC_URI[model-license.sha256sum] = "cfc7749b96f63bd31c3c42b5c471bf756814053e847c10f3eb003417bc523d30"
SRC_URI[model-squeezenet.md5sum] = "92e240a948f9bbc92534d752eb465317"
SRC_URI[model-squeezenet.sha256sum] = "f4c9a2906a949f089bee5ef1bf9ea1c0dc1b49d5abeb1874fff3d206751d0f3b"
SRCREV_runtime = "7c06686b4260a22bdf0e24e06c120882dc5eaa78"
SRCREV_model = "6ab957a2fe61f34a76c670946f7cbd806d2cacca"
SRCREV_FORMAT = "runtime_model"

S = "${WORKDIR}/git"

inherit cmake python3native

OECMAKE_SOURCEPATH = "${S}/cmake"
OECMAKE_GENERATOR = "Unix Makefiles"

# Notes:
# Protobuff/Protoc: 
#   - protobuf is essetially built twice for native and target system
#   - DONNX_CUSTOM_PROTOC_EXECUTABLE  - use native protoc
#   - onnxruntime_USE_PREBUILT_PB=OFF - we still need protobuf compiled from target system; although we already have native version
# Eigen: 
#   - the git operation within CMake fails, so we treat it as 'pre-installed' although it's fetched during fetch phase
#   - the eigen_SOURCE_PATH needs to match 'destsuffix' in SRC_URI for eigen

EXTRA_OECMAKE += "\
-DONNX_CUSTOM_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/${PN}-native/protoc \
-DCMAKE_BUILD_TYPE=RelWithDebInfo \
"

PYTHON_DEPENDS = "${PYTHON_PN} ${PYTHON_PN}-native ${PYTHON_PN}-pip-native ${PYTHON_PN}-wheel-native ${PYTHON_PN}-setuptools-native ${PYTHON_PN}-numpy-native"
PYTHON_RDEPENDS = "${PYTHON_PN} ${PYTHON_PN}-numpy ${PYTHON_PN}-protobuf flatbuffers-${PYTHON_PN}"

PACKAGECONFIG_VSI_NPU       = ""
PACKAGECONFIG_VSI_NPU:mx8-nxp-bsp   = "vsi_npu"
PACKAGECONFIG_VSI_NPU:mx8mm-nxp-bsp = ""
PACKAGECONFIG_VSI_NPU:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_VSI_NPU:mx8mpul-nxp-bsp = ""
PACKAGECONFIG_VSI_NPU:mx8ulp-nxp-bsp = ""

PACKAGECONFIG ?= "openmp reports sharedlib eigenblas nnapi python ${PACKAGECONFIG_VSI_NPU}"

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
PACKAGECONFIG[vsi_npu] = "-Donnxruntime_USE_VSI_NPU=ON -Donnxruntime_OVXLIB_INCLUDE=${STAGING_INCDIR}/OVXLIB, -Donnxruntime_USE_VSI_NPU=OFF, nn-imx"

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

do_compile:append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'python', 'true', 'false', d)}; then
        cd ${WORKDIR}/build
        ${PYTHON} ${S}/setup.py bdist_wheel
        git config --global --add safe.directory ${WORKDIR}/build/pybind11/src/pybind11
    fi
}

do_install:append() {
    CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
    
    # copy extracted squeezenet tarball and add Apache2 license
    cp $CP_ARGS ${WORKDIR}/squeezenet ${D}${bindir}/${BP}
    install -m 0644 ${WORKDIR}/LICENSE ${D}${bindir}/${BP}/squeezenet

    if ${@bb.utils.contains('PACKAGECONFIG', 'python', 'true', 'false', d)}; then
        export PIP_DISABLE_PIP_VERSION_CHECK=1
        export PIP_NO_CACHE_DIR=1
        install -d ${D}/${PYTHON_SITEPACKAGES_DIR}
        ${STAGING_BINDIR_NATIVE}/pip3 install -v \
            -t ${D}/${PYTHON_SITEPACKAGES_DIR} --no-deps \
            ${WORKDIR}/build/dist/onnxruntime-*.whl
        find ${D}/${PYTHON_SITEPACKAGES_DIR} -type d -name "__pycache__" -exec rm -Rf {} +
    fi
}

# libonnxruntime_providers_shared.so is being packaged into -dev which is intended
INSANE_SKIP:${PN}-dev += "dev-elf"

# a separate tests package for the test binaries not appearing in the main package
PACKAGE_BEFORE_PN = "${PN}-tests"
FILES:${PN}-tests = "${bindir}/${BP}/tests/*"
FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR}"

# libcustom_op_library.so is in bindir, which is intended;
# onnxruntime_shared_lib_test requires the shlib to be in the same directory as testdata to run properly
INSANE_SKIP:${PN}-tests += "libdir"
INSANE_SKIP:${PN}-dbg += "libdir"

RDEPENDS:${PN}-tests += "arm-compute-library"
