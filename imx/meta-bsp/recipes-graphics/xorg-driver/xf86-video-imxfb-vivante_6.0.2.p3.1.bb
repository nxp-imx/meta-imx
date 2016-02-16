# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "fded6d1636f263e32cae0e469408f6d9"
SRC_URI[sha256sum] = "02631a039fa55fd8eff97a6e3883fcb52b998b9ef245e73c4accc1a6126ed645"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
