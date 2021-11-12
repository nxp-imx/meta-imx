# Copyright 2021 NXP
DESCRIPTION = "Tensorflow-lite-extras package"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=58b894bdb769ed7c61370049c0b06b05"

DEPENDS = "opencv tensorflow-lite flatbuffers python3 python3-pip python3-numpy"

EFFICIENTDET_SRC ?= "git://source.codeaurora.org/external/imx/efficientdet-imx.git;protocol=https"
SRCBRANCH = "master"

SRC_URI = "${EFFICIENTDET_SRC};branch=${SRCBRANCH}"
SRCREV = "ba861cfd5fe7ce09975955408063855eee9ae562"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile:prepend() {
    cd ${S}/efficientdet/src
}

do_install() {
    install -d ${D}${bindir}/${BPN}

    install -m 0755 ${S}/efficientdet/models/efficientdet-lite0/* ${D}${bindir}/${BPN}
    install -m 0755 ${S}/efficientdet/src/efficientdet_demo ${D}${bindir}/${BPN}
    install -m 0755 ${S}/efficientdet/src/efficientdet_demo_gpu ${D}${bindir}/${BPN}
    install -m 0755 ${S}/samples/cars_short.mp4 ${D}${bindir}/${BPN}
}

COMPATIBLE_MACHINE = "(mx8qm|mx8mp)"
