# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "deccaa4b06c2a7e679fcacac6395887e"
SRC_URI[sha256sum] = "34e766d5f06433ae63b16f80384f8d5acf3dd379e0ef6098a27bbd094ce02c8f"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
