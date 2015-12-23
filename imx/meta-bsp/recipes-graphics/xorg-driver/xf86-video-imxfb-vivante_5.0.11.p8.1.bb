# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "8430630bad42e6299e18c2cf5415349b"
SRC_URI[sha256sum] = "51ac296e64b92dde75cc4779642ede3a47b357aca6fe7b46f3ddbc4fef6a3f00"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
