# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=1fd459c0c72a4d0723eeee2489aa540f"

SRC_URI[md5sum] = "021ecc38d41f409d678ecca8aa1711e6"
SRC_URI[sha256sum] = "e052317eab2194bf8fa4d4ce63426f1177ae7083aff6b528389c99adc9e1eee5"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
