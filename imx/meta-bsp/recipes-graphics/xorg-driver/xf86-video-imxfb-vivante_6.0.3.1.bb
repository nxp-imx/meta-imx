# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "3367da732251d7a0d7b19adc2ef913a7"
SRC_URI[sha256sum] = "b9b2edad8a9ae952d4d7eacb6413ede71a84d8911fc3def8025619c71c3a750b"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
