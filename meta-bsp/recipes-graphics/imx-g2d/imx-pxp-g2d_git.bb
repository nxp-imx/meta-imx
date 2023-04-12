# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX PXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ea25d099982d035af85d193c88a1b479"

PROVIDES += "virtual/libg2d"

PV = "2.1.0+git${SRCPV}"

SRC_URI = "${IMX_PXP_G2D_SRC};branch=${SRCBRANCH}"
IMX_PXP_G2D_SRC ?= "git://github.com/nxp-imx/imx-g2d-pxp.git;protocol=https"
SRCBRANCH ?= "imx_2.1"
SRCREV = "07a9c65ca96cd35ac2eaf475053dcb2bbc453a42"

S = "${WORKDIR}/git"

inherit use-imx-headers

EXTRA_OEMAKE = "PLATFORM=IMX93 INCLUDE='-I${STAGING_INCDIR_IMX}' DEST_DIR=${D}"

do_install() {
    oe_runmake install
}

COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
