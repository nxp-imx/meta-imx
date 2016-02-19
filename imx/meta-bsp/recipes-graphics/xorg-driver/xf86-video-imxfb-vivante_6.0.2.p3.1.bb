# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "73fe81417e1dc53da62711ade54c631e"
SRC_URI[sha256sum] = "f25dbc8b638f9543b2ded02898d76a5144bda6e87e2caa178fcb35771bf7d375"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
