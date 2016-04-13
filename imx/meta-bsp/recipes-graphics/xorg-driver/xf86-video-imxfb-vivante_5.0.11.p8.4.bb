# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI[md5sum] = "9b58bd13d54eeffe358a135cd90befd2"
SRC_URI[sha256sum] = "c555801cd664e912d1daa1036483f827de2150fa9cfdb2f456b7a3b9bf239fce"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
