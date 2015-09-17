# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "cccbad23580c17f259bbf88be4d738d2"
SRC_URI[sha256sum] = "98c45cf7b8e8b7778e0fdb6c12302ddeca4a216663c0093169fcdb02c421ddac"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
