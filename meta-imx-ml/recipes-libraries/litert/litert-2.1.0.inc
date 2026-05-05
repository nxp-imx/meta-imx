# Copyright 2025-2026 NXP

LITERT_SRC ?= "gitsm://github.com/nxp-imx/litert-imx.git;protocol=https"
SRCBRANCH_litert = "imx-v2.1.0"
SRCREV_litert = "3f5597754b2e52ff895e3ed858cf033757343447"

# ============================================================================
# All cmake dependency sources (git, no network access during build)
# Versions must match tflite/tools/cmake/modules/*.cmake files
# ============================================================================

# OverridableFetchContent packages
SRCREV_abseil-cpp = "20250814.0"
SRCREV_cpuinfo = "8a9210069b5a37dd89ed118a783945502a30a4ae"
SRCREV_egl-headers = "649981109e263b737e7735933c90626c29a306f2"
SRCREV_eigen = "dcbaf2d608f306450f1e74949eb87e9a22a7ef4b"
SRCREV_farmhash = "0d859a811870d10f53a594927d0d0b97573ad06d"
SRCREV_flatbuffers = "v25.9.23"
SRCREV_fft2d = "v1.0"
SRCREV_gemmlowp = "16e8662c34917be0065110bfcd9cc27d30f52fdf"
SRCREV_google-benchmark = "v1.7.0"
SRCREV_googletest = "release-1.12.1"
SRCREV_ml-dtypes = "00d98cd92ade342fef589c0470379abb27baebe9"
SRCREV_neon2sse = "a15b489e1222b2087007546b4912e21293ea86ff"
SRCREV_re2 = "2021-02-02"
SRCREV_ruy = "3286a34cc8de6149ac6844107dfdffac91531e72"
SRCREV_xnnpack = "77468446ebfd9baab7fc4349c32608c9675cf6d9"
SRCREV_protobuf = "v21.9"
SRCREV_pthreadpool = "0e6ca13779b57d397a5ba6bfdcaa8a275bc8ea2e"
SRCREV_fp16 = "0a92994d729ff76a58f692d3028ca1b64b145d91"
SRCREV_fxdiv = "b408327ac2a15ec3e43352421954f5b1967701d1"
SRCREV_kleidiai = "63205aa90afa6803d8f58bc3081b69288e9f1906"
SRCREV_tensorflow = "v2.19.0"

SRC_URI_DEPS = " \
             git://github.com/abseil/abseil-cpp;protocol=https;nobranch=1;name=abseil-cpp;destsuffix=deps/abseil-cpp \
             git://github.com/pytorch/cpuinfo;protocol=https;branch=main;name=cpuinfo;destsuffix=deps/cpuinfo \
             git://github.com/KhronosGroup/EGL-Registry;protocol=https;branch=main;name=egl-headers;destsuffix=deps/egl-headers \
             git://gitlab.com/libeigen/eigen.git;protocol=https;branch=master;name=eigen;destsuffix=deps/eigen \
             git://github.com/google/farmhash;protocol=https;branch=master;name=farmhash;destsuffix=deps/farmhash \
             git://github.com/google/flatbuffers;protocol=https;nobranch=1;name=flatbuffers;destsuffix=deps/flatbuffers \
             git://github.com/petewarden/OouraFFT;protocol=https;nobranch=1;name=fft2d;destsuffix=deps/fft2d \
             git://github.com/google/gemmlowp;protocol=https;branch=master;name=gemmlowp;destsuffix=deps/gemmlowp \
             git://github.com/google/benchmark;protocol=https;nobranch=1;name=google-benchmark;destsuffix=deps/google-benchmark \
             git://github.com/google/googletest;protocol=https;nobranch=1;name=googletest;destsuffix=deps/googletest \
             git://github.com/jax-ml/ml_dtypes;protocol=https;branch=main;name=ml-dtypes;destsuffix=deps/ml-dtypes \
             git://github.com/intel/ARM_NEON_2_x86_SSE;protocol=https;branch=master;name=neon2sse;destsuffix=deps/neon2sse \
             git://github.com/google/re2;protocol=https;nobranch=1;name=re2;destsuffix=deps/re2 \
             git://github.com/google/ruy;protocol=https;branch=master;name=ruy;destsuffix=deps/ruy \
             git://github.com/google/XNNPACK;protocol=https;branch=master;name=xnnpack;destsuffix=deps/xnnpack \
             git://github.com/protocolbuffers/protobuf;protocol=https;nobranch=1;name=protobuf;destsuffix=deps/protobuf \
             git://github.com/google/pthreadpool;protocol=https;branch=main;name=pthreadpool;destsuffix=deps/pthreadpool \
             git://github.com/Maratyszcza/FP16;protocol=https;branch=master;name=fp16;destsuffix=deps/fp16 \
             git://github.com/Maratyszcza/FXdiv;protocol=https;branch=master;name=fxdiv;destsuffix=deps/fxdiv \
             git://github.com/ARM-software/kleidiai;protocol=https;branch=main;name=kleidiai;destsuffix=deps/kleidiai \
             git://github.com/tensorflow/tensorflow;protocol=https;nobranch=1;name=tensorflow;destsuffix=deps/tensorflow"

SRCREV_FORMAT_DEPS = "abseil-cpp_cpuinfo_egl-headers_eigen_farmhash_flatbuffers_fft2d_gemmlowp_google-benchmark_googletest_ml-dtypes_neon2sse_re2_ruy_xnnpack_protobuf_pthreadpool_fp16_fxdiv_kleidiai_tensorflow"

# Offline dependency cmake flags (shared between TFLite and LiteRT builds)
DEPS_DIR ?= "${@d.getVar('UNPACKDIR') or d.getVar('WORKDIR')}/deps"
DEPS_CMAKE_FLAGS = " \
    -DFETCHCONTENT_SOURCE_DIR_ABSEIL-CPP=${DEPS_DIR}/abseil-cpp \
    -DFETCHCONTENT_SOURCE_DIR_CPUINFO=${DEPS_DIR}/cpuinfo \
    -DFETCHCONTENT_SOURCE_DIR_EGL-HEADERS=${DEPS_DIR}/egl-headers \
    -DFETCHCONTENT_SOURCE_DIR_EIGEN=${DEPS_DIR}/eigen \
    -DFETCHCONTENT_SOURCE_DIR_FARMHASH=${DEPS_DIR}/farmhash \
    -DFETCHCONTENT_SOURCE_DIR_FLATBUFFERS=${DEPS_DIR}/flatbuffers \
    -DFETCHCONTENT_SOURCE_DIR_FFT2D=${DEPS_DIR}/fft2d \
    -DFETCHCONTENT_SOURCE_DIR_GEMMLOWP=${DEPS_DIR}/gemmlowp \
    -DFETCHCONTENT_SOURCE_DIR_GOOGLE-BENCHMARK=${DEPS_DIR}/google-benchmark \
    -DFETCHCONTENT_SOURCE_DIR_GOOGLETEST=${DEPS_DIR}/googletest \
    -DFETCHCONTENT_SOURCE_DIR_ML_DTYPES=${DEPS_DIR}/ml-dtypes \
    -DFETCHCONTENT_SOURCE_DIR_NEON2SSE=${DEPS_DIR}/neon2sse \
    -DFETCHCONTENT_SOURCE_DIR_RE2=${DEPS_DIR}/re2 \
    -DFETCHCONTENT_SOURCE_DIR_RUY=${DEPS_DIR}/ruy \
    -DFETCHCONTENT_SOURCE_DIR_XNNPACK=${DEPS_DIR}/xnnpack \
    -DFETCHCONTENT_SOURCE_DIR_PROTOBUF=${DEPS_DIR}/protobuf \
    -DPTHREADPOOL_SOURCE_DIR=${DEPS_DIR}/pthreadpool \
    -DFP16_SOURCE_DIR=${DEPS_DIR}/fp16 \
    -DFXDIV_SOURCE_DIR=${DEPS_DIR}/fxdiv \
    -DKLEIDIAI_SOURCE_DIR=${DEPS_DIR}/kleidiai \
    -DTENSORFLOW_SOURCE_DIR=${DEPS_DIR}/tensorflow \
"
