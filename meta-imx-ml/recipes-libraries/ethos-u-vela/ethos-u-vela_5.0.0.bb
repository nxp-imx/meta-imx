# Copyright 2023-2026 NXP
DESCRIPTION = "The vela tool is used to compile a TensorFlow Lite for \
Microcontrollers neural network model into an optimised version that \
can run on an embedded system containing an Arm Ethos-U NPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e3fc50a88d0a364313df4b21ef20c29e"
DEPENDS = "flatbuffers python3-numpy python3-lxml python3-numpy-native"

SRC_URI = "${VELA_SRC};branch=${SRCBRANCH}"
VELA_SRC ?= "git://github.com/nxp-imx/ethos-u-vela.git;protocol=https"
SRCBRANCH = "imx_5.0.0"
SRCREV = "1404a14fcb630bad44c642a00da0965b3d576a30"

inherit setuptools3

do_compile[network] = "1"
do_compile:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}

do_install:append() {
    # install libregor to libdir instead of ${PYTHON_DIR}
    install -d ${D}${libdir}
    rm ${D}${libdir}/${PYTHON_DIR}${PYTHON_ABI}/site-packages/ethosu/libregor*
    for lib in $(find ${B} -name "libregor*"); do
        cp -a --no-preserve=ownership $lib ${D}${libdir}
    done

    # install headers
    install -d ${D}${includedir}
    install -m 0644 ${S}/ethosu/regor/include/regor.h ${D}${includedir}
}

RDEPENDS:${PN} += "python3-flatbuffers python3-numpy python3-lxml"

INSANE_SKIP:${PN} = "already-stripped"

BBCLASSEXTEND = "native nativesdk"
