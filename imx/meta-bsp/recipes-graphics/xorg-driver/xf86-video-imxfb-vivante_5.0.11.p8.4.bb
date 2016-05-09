# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "7a2c8d4e56c33b9692d252193f00ef44"
SRC_URI[sha256sum] = "ddb6de9e00ce0b22f6c905eaf6694424413eade53ef6cd3b36e20ac99dcc0e0f"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
