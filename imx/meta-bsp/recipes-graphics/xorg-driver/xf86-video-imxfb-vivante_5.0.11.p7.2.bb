# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "e93fc6e0211ef5f2f156ce9cdf963912"
SRC_URI[sha256sum] = "9557f48120c579bac3406c761f17c4a24b0f120b4a1a27f1177a94949c0830fc"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
