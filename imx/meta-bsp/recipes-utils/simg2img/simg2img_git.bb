# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "A tool to convert Android sparse images to raw images"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://Makefile;md5=54ba9e30fc8d139ebce9ea0f900a229c"

DEPENDS = "zlib"

SIMG2IMG_SRC ?= "git://git.freescale.com/imx/simg2img.git;protocol=git"
SRC_BRANCH = "master"

SRC_URI = "${SIMG2IMG_SRC};branch=${SRC_BRANCH}"
SRCREV  = "${AUTOREV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'CC="${CC}"'

do_install() {
    install -d ${D}${bindir}
    cp ${S}/simg2img ${D}${bindir}/
    chmod a+x ${D}${bindir}/simg2img
}

INSANE_SKIP_${PN} = "ldflags"
