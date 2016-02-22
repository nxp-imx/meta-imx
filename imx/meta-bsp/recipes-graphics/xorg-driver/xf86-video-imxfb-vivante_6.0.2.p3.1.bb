# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "ad47bd48b19db8c453271c3ab821a162"
SRC_URI[sha256sum] = "76b1ae44c775b0f2a3e7fe8a536a216ea37952ad8e9672e80ed3f8c0e8749f91"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
