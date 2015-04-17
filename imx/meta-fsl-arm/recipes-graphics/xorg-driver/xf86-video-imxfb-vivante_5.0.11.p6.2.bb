# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "6ae2e58ca93db1834169d9bcec32eaf3"
SRC_URI[sha256sum] = "ae5bcfe428c1690f330fc75fbc9596912ccd0edef718821bef7dda662965a651"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}/"
