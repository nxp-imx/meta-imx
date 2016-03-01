# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "79067d3fac40aa256b7a8617f0e4ae79"
SRC_URI[sha256sum] = "e801ad041f1b1dba081b2afbd5b9a9c096905cdf8d054582b5de550e181d0abf"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
