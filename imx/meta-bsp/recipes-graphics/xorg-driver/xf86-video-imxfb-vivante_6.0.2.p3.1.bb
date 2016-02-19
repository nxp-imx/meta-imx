# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "da1b14c562863f0e8302191161775790"
SRC_URI[sha256sum] = "e1e770365418d3dff41b859af9592166a7f9de38fb32f132fbddd0ffcf82a32f"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
