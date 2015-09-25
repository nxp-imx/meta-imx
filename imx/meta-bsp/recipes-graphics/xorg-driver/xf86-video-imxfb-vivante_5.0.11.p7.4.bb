# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "0c43450833fc3b1fc7c7963e3595d7a3"
SRC_URI[sha256sum] = "b05c0064e2afa72ef37dc0a79a84780412f988ce37f20417c525fb45f644b693"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
