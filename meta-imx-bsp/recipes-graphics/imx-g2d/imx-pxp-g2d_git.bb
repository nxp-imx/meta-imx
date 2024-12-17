# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX PXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca53281cc0caa7e320d4945a896fb837"

PROVIDES += "virtual/libg2d"

PV = "2.3+git${SRCPV}"

SRC_URI = "${IMX_PXP_G2D_SRC};branch=${SRCBRANCH}"
IMX_PXP_G2D_SRC ?= "git://github.com/nxp-imx/imx-g2d-pxp.git;protocol=https"
SRCBRANCH = "imx_2.3"
SRCREV = "0e617c19c60d8619d3a2eb435715e682b9753ddd"

S = "${WORKDIR}/git"

inherit use-imx-headers

EXTRA_OEMAKE = "PLATFORM=IMX93 INCLUDE='-I${STAGING_INCDIR_IMX}' DEST_DIR=${D}"

do_install() {
    oe_runmake install
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
