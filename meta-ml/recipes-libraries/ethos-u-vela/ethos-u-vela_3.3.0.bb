# Copyright 2022 NXP
DESCRIPTION = "The vela tool is used to compile a TensorFlow Lite for \
Microcontrollers neural network model into an optimised version that \
can run on an embedded system containing an Arm Ethos-U NPU"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS = "python3-pip-native python3-wheel-native flatbuffers python3-numpy python3-lxml"
RDEPENDS:${PN} += "flatbuffers python3-numpy python3-lxml"

VELA_SRC ?= "git://source.codeaurora.org/external/imx/vela-imx.git;protocol=https"
SRCBRANCH = "lf-5.15.52_2.1.0"
SRCREV = "4010268b6a7869845ae01159ed70e9663d17050e"
SRC_URI = "${VELA_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
inherit setuptools3

do_compile[network] = "1"
do_compile:prepend() {
    export HTTP_PROXY=${http_proxy}
    export HTTPS_PROXY=${https_proxy}
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}

COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"

