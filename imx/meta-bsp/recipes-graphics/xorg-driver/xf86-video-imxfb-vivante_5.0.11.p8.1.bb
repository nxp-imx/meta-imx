# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "0b897b47610420716d4f11c212dcc369"
SRC_URI[sha256sum] = "fd8477f1b0474c6e43ebd68152093677e1d69fb0457188997d7e2de7a46095ed"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
