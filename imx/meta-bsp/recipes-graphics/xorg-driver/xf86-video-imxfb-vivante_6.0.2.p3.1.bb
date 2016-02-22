# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "9c9ae97bb7d3c6c6813dd9ac15c3cab9"
SRC_URI[sha256sum] = "b0bace44cbad95eb2b2c46e074c4c15322eb8e29b51351c769c67febf0dd115b"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
