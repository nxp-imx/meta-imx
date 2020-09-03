SUMMARY = "ARM Neural Network SDK"
DESCRIPTION = "Linux software and tools to enable machine learning (Caffe/Tensorflow) workloads on power-efficient devices"
LICENSE = "MIT & Apache-2.0"
# Apache-2.0 license applies to mobilenet tarball
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e14a924c16f7d828b8335a59da64074 \
                    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

#PR = "r1"
PV = "20.02"

ARMNN_SRC ?= "git://source.codeaurora.org/external/imx/armnn-imx.git;protocol=https"
SRCBRANCH = "imx_5.4.47_2.2.0"
SRCREV = "a69c52cbe4bbf54c38a5c54927c6b57b7390c252"

SRCREV_FORMAT = "armnn"

S = "${WORKDIR}/git"

inherit cmake

SRC_URI = " \
    ${ARMNN_SRC};branch=${SRCBRANCH} \
    http://download.tensorflow.org/models/mobilenet_v1_2018_02_22/mobilenet_v1_1.0_224.tgz;name=mobilenet;subdir=${WORKDIR}/tfmodel;destsuffix=tfmodel \
"

SRC_URI[mobilenet.md5sum] = "d5f69cef81ad8afb335d9727a17c462a"
SRC_URI[mobilenet.sha256sum] = "1ccb74dbd9c5f7aea879120614e91617db9534bdfaa53dfea54b7c14162e126b"

DEPENDS = " \
    boost \
    protobuf \
    stb \
"
RDEPENDS_MX8       = ""
RDEPENDS_MX8_mx8   = "nn-imx"
RDEPENDS_MX8_mx8mm = ""
RDEPENDS_${PN}   = " \
    arm-compute-library \
    protobuf \
    boost \
    ${RDEPENDS_MX8} \
"
PACKAGECONFIG_VSI_NPU       = ""
PACKAGECONFIG_VSI_NPU_mx8   = "vsi_npu"
PACKAGECONFIG_VSI_NPU_mx8mm = ""

PACKAGECONFIG ??= "neon ref caffe tensorflow tensorflow_lite onnx tests ${PACKAGECONFIG_VSI_NPU}"

PACKAGECONFIG[caffe] = "-DBUILD_CAFFE_PARSER=1 -DCAFFE_GENERATED_SOURCES=${STAGING_DIR_HOST}${datadir}/armnn-caffe,-DBUILD_CAFFE_PARSER=0,armnn-caffe"
PACKAGECONFIG[neon] = "-DARMCOMPUTENEON=1 -DARMCOMPUTE_LIBRARY_RELEASE=${STAGING_LIBDIR}/libarm_compute.so -DARMCOMPUTE_CORE_LIBRARY_RELEASE=${STAGING_LIBDIR}/libarm_compute_core.so,-DARMCOMPUTENEON=0,arm-compute-library"
PACKAGECONFIG[onnx] = "-DBUILD_ONNX_PARSER=1 -DONNX_GENERATED_SOURCES=${STAGING_DIR_HOST}${datadir}/armnn-onnx ,-DBUILD_ONNX_PARSER=0,armnn-onnx"
PACKAGECONFIG[opencl] = "-DARMCOMPUTECL=1,-DARMCOMPUTECL=0,opencl-headers"
PACKAGECONFIG[tensorflow] = "-DBUILD_TF_PARSER=1 -DTF_GENERATED_SOURCES=${STAGING_DIR_HOST}${datadir}/armnn-tensorflow,-DBUILD_TF_PARSER=0, armnn-tensorflow "
PACKAGECONFIG[tensorflow_lite] = "-DTF_LITE_SCHEMA_INCLUDE_PATH=${STAGING_DIR_HOST}${datadir}/armnn-tensorflow-lite -DTF_LITE_GENERATED_PATH=${STAGING_DIR_HOST}${datadir}/armnn-tensorflow-lite -DBUILD_TF_LITE_PARSER=1 ,-DBUILD_TF_LITE_PARSER=0, flatbuffers armnn-tensorflow"
PACKAGECONFIG[unit_tests] = "-DBUILD_UNIT_TESTS=1,-DBUILD_UNIT_TESTS=0"
PACKAGECONFIG[tests] = "-DBUILD_TESTS=1,-DBUILD_TESTS=0"
PACKAGECONFIG[ref] = "-DARMNNREF=1,-DARMNNREF=0"
PACKAGECONFIG[vsi_npu] = "-DVSI_NPU=1,-DVSI_NPU=0,nn-imx"

EXTRA_OECMAKE += " \
    -DSHARED_BOOST=1 \
"

TESTVECS_INSTALL_DIR = "${datadir}/arm/armnn"

do_install_append() {
    CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
    install -d ${D}${bindir}
    find ${WORKDIR}/build/tests -maxdepth 1 -type f -executable -exec cp $CP_ARGS {} ${D}${bindir} \;
    install -d ${D}${TESTVECS_INSTALL_DIR}/models
    cp ${WORKDIR}/tfmodel/mobilenet_v1_1.0_224_frozen.pb  ${D}${TESTVECS_INSTALL_DIR}/models
    cp ${WORKDIR}/git/tests/TfMobileNet-Armnn/labels.txt  ${D}${TESTVECS_INSTALL_DIR}/models
    chrpath -d ${D}${bindir}/*
}

CXXFLAGS += "-fopenmp"
LIBS += "-larmpl_lp64_mp"

FILES_${PN} += "${TESTVECS_INSTALL_DIR}"
FILES_${PN}-dev += "{libdir}/cmake/*"
INSANE_SKIP_${PN} = "dev-deps"
INSANE_SKIP_${PN}-dev = "dev-elf"

# We support i.MX8 only (for now)
COMPATIBLE_MACHINE = "(mx8)"
