# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI[md5sum] = "f9368db27ced09eaa8a29e2ad293496a"
SRC_URI[sha256sum] = "77194b6296f642b0ba7a16c68c3f2c906570c6bbe5e11720a04b50580b4b1c54"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
