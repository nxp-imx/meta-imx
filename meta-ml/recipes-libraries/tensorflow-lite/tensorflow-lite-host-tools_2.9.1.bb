# Copyright 2022 NXP
DESCRIPTION = "Host tools required for build of TensorFlow Lite C++ Library unit tests and Evaluation Tools"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4158a261ca7f2525513e31ba9c50ae98"

require tensorflow-lite-${PV}.inc
SRC_URI = "${TENSORFLOW_LITE_SRC};branch=${SRCBRANCH_tf};name=tf"

inherit cmake

S = "${WORKDIR}/git"
OECMAKE_SOURCEPATH = "${S}/tensorflow/lite/tools/cmake/native_tools"

BBCLASSEXTEND = "native nativesdk"

EXTRA_OECMAKE = " \
    -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
    -DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR} \
"

CXXFLAGS += "-fPIC"

do_configure[network] = "1"
do_configure:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}