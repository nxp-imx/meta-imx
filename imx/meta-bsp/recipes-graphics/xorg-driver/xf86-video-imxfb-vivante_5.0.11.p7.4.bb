# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://exabuild.patch \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "2e53a561ad0be0f1a5360d57072e83e7"
SRC_URI[sha256sum] = "b5ef7058a86b1a655fdd0c532abab6d15cce8c6bf08b95db310c09397b6d62cf"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
