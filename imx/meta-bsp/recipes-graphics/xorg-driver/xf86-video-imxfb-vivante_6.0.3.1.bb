# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "1aa8e734b1fc80af1d13910e9ae1289e"
SRC_URI[sha256sum] = "c00d1eb8c171aae02385e4d5838182790caea5c8eae164bb0af117ad3ed700f8"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
