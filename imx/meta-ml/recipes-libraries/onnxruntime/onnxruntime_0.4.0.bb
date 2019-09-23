DESCRIPTION = "cross-platform, high performance scoring engine for ML models"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=980784f0a7f667becbed133924b263bf"

DEPENDS = "libpng zlib ${BPN}-native"

GIT_onnxruntime = "gitsm://github.com/Microsoft/onnxruntime.git;branch=rel-0.4.0;name=onnxruntime"

SRCREV_onnxruntime = "bf859a9a5489a5f0c954ad7da724f3514983d0e3"

SRC_URI = "\
    ${GIT_onnxruntime} \
    file://Fix_Eigen_Build_Break.patch \
    file://0001-Undefine-MLAS-THREADPOOL-when-using-OPENMP.patch \
"
SRCREV_FORMAT = "onnxruntime"

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
-Donnxruntime_USE_PREBUILT_PB=OFF \
-DONNX_CUSTOM_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/${PN}-native/protoc \
-DCMAKE_NO_SYSTEM_FROM_IMPORTED=True \
-Donnxruntime_RUN_ONNX_TESTS=OFF \
-Donnxruntime_GENERATE_TEST_REPORTS=ON \
-Donnxruntime_DEV_MODE=ON \
-Donnxruntime_USE_CUDA=OFF \
-Donnxruntime_CUDNN_HOME= \
-Donnxruntime_USE_JEMALLOC=OFF \
-Donnxruntime_BUILD_CSHARP=OFF \
-Donnxruntime_BUILD_SHARED_LIB=ON \
-Donnxruntime_USE_EIGEN_FOR_BLAS=ON \
-Donnxruntime_USE_OPENBLAS=OFF \
-Donnxruntime_USE_MKLDNN=OFF \
-Donnxruntime_USE_MKLML=OFF \
-Donnxruntime_USE_TVM=OFF \
-Donnxruntime_USE_LLVM=OFF \
-Donnxruntime_ENABLE_MICROSOFT_INTERNAL=OFF \
-Donnxruntime_USE_EIGEN_THREADPOOL=OFF \
-Donnxruntime_USE_MLAS=ON \
-DCMAKE_BUILD_TYPE=RelWithDebInfo \
"

PACKAGECONFIG ?= "openmp test"
PACKAGECONFIG[nsync] = "-Donnxruntime_USE_NSYNC=ON, -Donnxruntime_USE_NSYNC=OFF"
PACKAGECONFIG[openmp] = "-Donnxruntime_USE_OPENMP=ON, -Donnxruntime_USE_OPENMP=OFF"
PACKAGECONFIG[trt] = "-Donnxruntime_USE_TRT=ON, -Donnxruntime_USE_TRT=OFF"
PACKAGECONFIG[nuphar] = "-Donnxruntime_USE_NUPHAR=ON, -Donnxruntime_USE_NUPHAR=OFF"
PACKAGECONFIG[brainslice] = "-Donnxruntime_USE_BRAINSLICE=ON, -Donnxruntime_USE_BRAINSLICE=OFF"
PACKAGECONFIG[python] = "-Donnxruntime_ENABLE_PYTHON=ON, -Donnxruntime_ENABLE_PYTHON=OFF"

PACKAGECONFIG[test] = "-Donnxruntime_BUILD_UNIT_TESTS=ON, -Donnxruntime_BUILD_UNIT_TESTS=OFF"
PACKAGECONFIG[benchmark] = "-Donnxruntime_BUILD_BENCHMARKS=ON, -Donnxruntime_BUILD_BENCHMARKS=OFF"
