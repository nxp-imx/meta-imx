# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://exabuild.patch \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "1b038c581d1671a4cfb366ee3e40f75c"
SRC_URI[sha256sum] = "4a7956e4b1cbb64de0e52fce467e5322c73e8efa97c71ac2968e8cd438e09bef"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
