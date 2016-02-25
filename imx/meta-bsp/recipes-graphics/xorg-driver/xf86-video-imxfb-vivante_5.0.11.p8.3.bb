# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "b1495ee1ac779afeb4b36f8af4abd104"
SRC_URI[sha256sum] = "15e3d1de73c5cdb5009c5192e45ef99ee35cccaaddaea534eb74c45a2cd620a0"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
