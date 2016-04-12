# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "5989563508c80859d3d2badb3588f086"
SRC_URI[sha256sum] = "d4b009d2d523b3516a4536a9c25e86c98c167fb271bd718414e327a12aab550d"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri"

COMPATIBLE_MACHINE = "(mx6|mx8)"
