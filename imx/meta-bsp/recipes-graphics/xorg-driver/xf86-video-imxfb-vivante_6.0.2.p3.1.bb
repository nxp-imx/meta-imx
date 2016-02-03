# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "66c71c4c7afa7c09cc97f291a454e9fa"
SRC_URI[sha256sum] = "9bc4dec4acd88e9d6c8a9f9b7a7cb24435537bc7cb73728a0286dad569821a1e"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
