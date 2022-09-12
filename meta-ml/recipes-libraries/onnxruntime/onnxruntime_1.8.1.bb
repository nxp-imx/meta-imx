# Copyright 2020-2021
DESCRIPTION = "cross-platform, high performance scoring engine for ML models"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f7e3b1308cb5c00b372a6e78835732d"

DEPENDS = "libpng zlib ${BPN}-native"

ONNXRUNTIME_SRC ?= "gitsm://github.com/nxp-imx/onnxruntime-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.52_2.1.0"

SRCREV = "fae2bd45e33e2b9d7160a7eff2247a4721003e05"

SRC_URI = "\
    ${ONNXRUNTIME_SRC};branch=${SRCBRANCH} \
"
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
PACKAGECONFIG_VSI_NPU       = ""
PACKAGECONFIG_VSI_NPU_mx8   = "vsi_npu"
PACKAGECONFIG_VSI_NPU_mx8mm = ""
PACKAGECONFIG_VSI_NPU_mx8mnul = ""
PACKAGECONFIG_VSI_NPU_mx8ulp = ""

PACKAGECONFIG ?= "openmp test reports sharedlib armnn eigenblas acl acl-2102 nnapi ${PACKAGECONFIG_VSI_NPU}"

PACKAGECONFIG[nsync] = "-Donnxruntime_USE_NSYNC=ON, -Donnxruntime_USE_NSYNC=OFF"
PACKAGECONFIG[prebuilt] = "-Donnxruntime_USE_PREBUILT_PB=ON, -Donnxruntime_USE_PREBUILT_PB=OFF"
PACKAGECONFIG[openmp] = "-Donnxruntime_USE_OPENMP=ON, -Donnxruntime_USE_OPENMP=OFF"
PACKAGECONFIG[trt] = "-Donnxruntime_USE_TRT=ON, -Donnxruntime_USE_TRT=OFF"
PACKAGECONFIG[nuphar] = "-Donnxruntime_USE_NUPHAR=ON, -Donnxruntime_USE_NUPHAR=OFF"
PACKAGECONFIG[brainslice] = "-Donnxruntime_USE_BRAINSLICE=ON, -Donnxruntime_USE_BRAINSLICE=OFF"
PACKAGECONFIG[python] = "-Donnxruntime_ENABLE_PYTHON=ON, -Donnxruntime_ENABLE_PYTHON=OFF"
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
PACKAGECONFIG[x86] = "-Donnxruntime_BUILD_x86=ON, -Donnxruntime_BUILD_x86=OFF"
PACKAGECONFIG[fullprotobuf] = "-Donnxruntime_USE_FULL_PROTOBUF=ON, -Donnxruntime_USE_FULL_PROTOBUF=OFF"
PACKAGECONFIG[ops] = "-Donnxruntime_DISABLE_CONTRIB_OPS=ON, -Donnxruntime_DISABLE_CONTRIB_OPS=OFF"
PACKAGECONFIG[staticruntime] = "-Donnxruntime_MSVC_STATIC_RUNTIME=ON, -Donnxruntime_MSVC_STATIC_RUNTIME=OFF"
PACKAGECONFIG[test] = "-Donnxruntime_BUILD_UNIT_TESTS=ON, -Donnxruntime_BUILD_UNIT_TESTS=OFF"
PACKAGECONFIG[benchmark] = "-Donnxruntime_BUILD_BENCHMARKS=ON, -Donnxruntime_BUILD_BENCHMARKS=OFF"
PACKAGECONFIG[runtests] = "-Donnxruntime_RUN_ONNX_TESTS=ON, -Donnxruntime_RUN_ONNX_TESTS=OFF"
PACKAGECONFIG[reports] = "-Donnxruntime_GENERATE_TEST_REPORTS=ON, -Donnxruntime_GENERATE_TEST_REPORTS=OFF"
PACKAGECONFIG[devmode] = "-Donnxruntime_DEV_MODE=ON, -Donnxruntime_DEV_MODE=OFF"
PACKAGECONFIG[cuda] = "-Donnxruntime_USE_CUDA=ON, -Donnxruntime_USE_CUDA=OFF"
PACKAGECONFIG[automl] = "-Donnxruntime_USE_AUTOML=ON, -Donnxruntime_USE_AUTOML=OFF"
PACKAGECONFIG[jemalloc] = "-Donnxruntime_USE_JEMALLOC=ON, -Donnxruntime_USE_JEMALLOC=OFF"
PACKAGECONFIG[mimalloc] = "-Donnxruntime_USE_MIMALLOC=ON, -Donnxruntime_USE_MIMALLOC=OFF"
PACKAGECONFIG[csharp] = "-Donnxruntime_BUILD_CSHARP=ON, -Donnxruntime_BUILD_CSHARP=OFF"
PACKAGECONFIG[java] = "-Donnxruntime_BUILD_JAVA=ON, -Donnxruntime_BUILD_JAVA=OFF"

PACKAGECONFIG[armnn] = "-Donnxruntime_USE_ARMNN=ON, -Donnxruntime_USE_ARMNN=OFF, armnn"
PACKAGECONFIG[acl] = "-Donnxruntime_USE_ACL=ON, -Donnxruntime_USE_ACL=OFF, arm-compute-library, arm-compute-library"
PACKAGECONFIG[acl-1908] = "-Donnxruntime_USE_ACL_1908=ON, -Donnxruntime_USE_ACL_1908=OFF, arm-compute-library"
PACKAGECONFIG[acl-2002] = "-Donnxruntime_USE_ACL_2002=ON, -Donnxruntime_USE_ACL_2002=OFF, arm-compute-library"
PACKAGECONFIG[acl-2008] = "-Donnxruntime_USE_ACL_2008=ON, -Donnxruntime_USE_ACL_2008=OFF, arm-compute-library"
PACKAGECONFIG[acl-2102] = "-Donnxruntime_USE_ACL_2102=ON, -Donnxruntime_USE_ACL_2102=OFF, arm-compute-library"
PACKAGECONFIG[vsi_npu] = "-Donnxruntime_USE_VSI_NPU=ON -Donnxruntime_OVXLIB_INCLUDE=${STAGING_INCDIR}/OVXLIB, -Donnxruntime_USE_VSI_NPU=OFF, nn-imx"

# libonnxruntime_providers_shared.so is being packaged into -dev which is intended
INSANE_SKIP_${PN}-dev += "dev-elf"
