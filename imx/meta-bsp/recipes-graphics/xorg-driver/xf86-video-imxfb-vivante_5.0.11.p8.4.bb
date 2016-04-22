# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI[md5sum] = "54e2b1ae4dbbd2419c6e55725cd39bcb"
SRC_URI[sha256sum] = "75d1ea4c2abff752d7b55d6e756f0492200a6de2912cfd618121ef4f74da4eaa"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
