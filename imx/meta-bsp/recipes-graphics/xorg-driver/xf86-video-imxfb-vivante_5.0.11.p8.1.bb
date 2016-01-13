# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "e4e0824c625f2c0eb6efbe0455cb194a"
SRC_URI[sha256sum] = "254d477c9e6576df9599af8f7da1e74b905d617057dfb93025c3ba1a9e5640b7"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
