# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "73259e648423e0cad17269c436f68fa2"
SRC_URI[sha256sum] = "c829b57d048864e6b90766d6ce3df0baa4a60f010a6553ab22bcd8f677ca8a3c"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
