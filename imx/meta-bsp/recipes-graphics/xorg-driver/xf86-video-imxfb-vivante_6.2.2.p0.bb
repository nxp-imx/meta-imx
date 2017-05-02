# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI[md5sum] = "4fa006a5750e25369e6d9feac82949b4"
SRC_URI[sha256sum] = "9bc6a55c6a2dff468f6b9a3d173d0fcb4ebd1bddd819d429198e1fccfc120a61"

DEPENDS += "virtual/libg2d"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
