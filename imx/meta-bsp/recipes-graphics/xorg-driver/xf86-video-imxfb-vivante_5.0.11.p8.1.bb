# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "030bf942bf14e2e924a8b7877860dd09"
SRC_URI[sha256sum] = "2c3cb24434b4f127f34b239d73481986253ddc2a3044e916c84dbcb613c32186"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
