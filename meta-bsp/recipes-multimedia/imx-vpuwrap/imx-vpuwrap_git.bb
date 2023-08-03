# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale Multimedia VPU wrapper"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

DEPENDS = "virtual/imxvpu"
DEPENDS:append:mx8mp-nxp-bsp = " imx-vpu-hantro-vc"

SRC_URI = "${IMX_VPUWRAP_SRC};branch=${SRCBRANCH}"
IMX_VPUWRAP_SRC ?= "git://github.com/NXP/imx-vpuwrap.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "b5247ffe8496bf6d2d16809cbae16ae2112cd73c"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_install:append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(imxvpu)"
