# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRCBRANCH = "imx_4.9.11_1.0.0_ga"
S = "${WORKDIR}/git/"
XF86_VIDEO_IMX_VIVANTE_SRC ?= "git://git.freescale.com/imx/xf86-video-imx-vivante.git;protocol=git"
SRC_URI = "${XF86_VIDEO_IMX_VIVANTE_SRC};branch=${SRCBRANCH}"
SRC_URI +="file://rc.autohdmi"
SRCREV = "07ef065dfe09f1c05a1a188c371577faa3677a17"

DEPENDS += "virtual/libg2d"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
