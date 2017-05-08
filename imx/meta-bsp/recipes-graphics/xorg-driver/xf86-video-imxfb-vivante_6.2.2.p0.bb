# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRCBRANCH = "imx_exa_viv6_g2d"
S = "${WORKDIR}/git/"
XF86_VIDEO_IMXFB_VIV_SRC ?= "git://git.freescale.com/imx/xf86-imxfb-vivante.git;protocol=git"
SRC_URI = "${XF86_VIDEO_IMXFB_VIV_SRC};branch=${SRCBRANCH} \
SRCREV = "568869b97b712d276e84c94f2f633f251bbab331"
            file://rc.autohdmi"

DEPENDS += "virtual/libg2d"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

# work-around for 6.2.2 build issue
CFLAGS_append = " -DLINUX"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
