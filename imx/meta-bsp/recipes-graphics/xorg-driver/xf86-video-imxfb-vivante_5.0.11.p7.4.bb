# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "0e0dbde09c90acac4ec4c63b07b11d68"
SRC_URI[sha256sum] = "6608993cc80e9f20adb0735bdbfd741eaf3b0bfd79513597047debd557d0f493"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
