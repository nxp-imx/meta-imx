# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017,2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "A tool to convert Android sparse images to raw images"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b433a746dd6fe8862028b1d7fc412a4d"

DEPENDS = "zlib"

SIMG2IMG_SRC ?= "git://github.com/nxp-imx/simg2img.git;protocol=https"
SRC_BRANCH = "master"

SRC_URI = "${SIMG2IMG_SRC};branch=${SRC_BRANCH}"
SRCREV = "7fa7e281c6b681497be29ba442ed0c9ab45304e9"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'CC="${CC}"'

do_install() {
    install -d ${D}${bindir}
    cp ${S}/simg2img ${D}${bindir}/
    chmod a+x ${D}${bindir}/simg2img
}

INSANE_SKIP:${PN} = "ldflags"
