# Copyright 2021 NXP
DESCRIPTION = "Tensorflow-lite-extras package"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7cfe6cb536a3395a386829e7a7a6e49d"

DEPENDS = "opencv tensorflow-lite flatbuffers python3 python3-pip python3-numpy"

EFFICIENTDET_SRC ?= "git://source.codeaurora.org/external/imx/efficientdet-imx.git;protocol=https"
SRCBRANCH = "lf-5.15.5_1.0.0"

SRC_URI = "${EFFICIENTDET_SRC};branch=${SRCBRANCH}"
SRCREV = "9cd64927f0cea5604b4511b4fd7e2044857357f1"

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
    install -m 0755 ${S}/samples/cars_short.mp4 ${D}${bindir}/${BPN}
    install -m 0755 ${S}/DEMO_README.md ${D}${bindir}/${BPN}
}

COMPATIBLE_MACHINE = "(mx8qm|mx8mp)"
