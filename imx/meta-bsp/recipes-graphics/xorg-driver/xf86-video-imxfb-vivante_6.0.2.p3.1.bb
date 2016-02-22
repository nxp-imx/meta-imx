# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "6cc145bdf881648c42b90b0109627e5d"
SRC_URI[sha256sum] = "2300b96567cdec24b88a5216149bb5d44f45c33a1a61d80462cfce08745bc103"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
