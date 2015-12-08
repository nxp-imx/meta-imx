# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "6e2d8ee518e9eef8421e9dcdc1ea79c3"
SRC_URI[sha256sum] = "3effaf42bde64da8fad2dfe0dcef12d1cfbbbe189511dbd4612442129fd832cc"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
