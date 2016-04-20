# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "59f6471a93b74efbbddfa2a49189ae66"
SRC_URI[sha256sum] = "8c43d927b536bfde3f04456a935591b5beec373b2aa88f0f2c0847daf085571e"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"

RDEPENDS_${PN}_append = " libvivante-dri"

COMPATIBLE_MACHINE = "(mx6|mx8)"
