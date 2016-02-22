# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "0357019d74bb3bb3a7463fb5a419e352"
SRC_URI[sha256sum] = "191d5aa7fe7f832f06a5d2b5bfadedf202a36a294d62ef0f1e07a7bb92e76dc9"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
