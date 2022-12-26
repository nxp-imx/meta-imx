# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale Multimedia VPU wrapper"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=${FSL_EULA_FILE_MD5SUM_LA_OPT_NXP_SOFTWARE_LICENSE_V40}"

DEPENDS = "virtual/imxvpu"
DEPENDS:append:mx8mp-nxp-bsp = " imx-vpu-hantro-vc"

SRC_URI = "${IMX_VPUWRAP_SRC};branch=${SRCBRANCH}"
IMX_VPUWRAP_SRC ?= "git://github.com/NXP/imx-vpuwrap.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "38c99ec7c762b0cd86ab3b06d646c9fc0803e761"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_install:append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(imxvpu)"
