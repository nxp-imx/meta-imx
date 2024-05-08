# Copyright 2020-2024 NXP
SUMMARY = "Tensors and Dynamic neural networks in Python with strong GPU acceleration"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c57cfb31165de565a47b65b896391c2"

PV = "2.0.0"

DEPENDS = "python3 python3-pip-native python3-wheel-native"
RDEPENDS:${PN} += "python3-core python3-numpy python3-future python3-typing-extensions python3-pillow numactl libjpeg-turbo lcms openjpeg"

PYTORCH_SRC ?= "git://github.com/nxp-imx/pytorch-release.git;protocol=https"
SRCBRANCH = "lf-6.6.23_2.0.0"
SRCREV = "012e780225f891b90747592e254b2399d6ec07fb"

SRC_URI = " \
    ${PYTORCH_SRC};branch=${SRCBRANCH} \
"

inherit python3native

S = "${WORKDIR}/git"

do_install(){
    install -d ${D}${bindir}
    install -d ${D}${bindir}/${PN}/examples

    install -m 0555 ${S}/examples/* ${D}${bindir}/${PN}/examples
}
