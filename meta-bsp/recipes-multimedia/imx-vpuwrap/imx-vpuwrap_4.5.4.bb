# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Freescale Multimedia VPU wrapper"
DEPENDS = "virtual/imxvpu"
DEPENDS_append_mx8mp = " imx-vpu-hantro-vc"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

IMX_VPUWRAP_SRC ?= "git://github.com/NXP/vpu_wrapper.git;protocol=https"
SRCBRANCH = "MM_04.05.04_2002_L5.4.3"
SRC_URI = "${IMX_VPUWRAP_SRC};branch=${SRCBRANCH}"
SRCREV = "94c38de72ae4588f6ea202cb36f942e1341250c1" 
S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_install_append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Compatible only for i.MX with VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpu = "${MACHINE}"
