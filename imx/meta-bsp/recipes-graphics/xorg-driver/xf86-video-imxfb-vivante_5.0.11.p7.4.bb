# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://exabuild.patch \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "4fd5e211e407b355dc759297937088ea"
SRC_URI[sha256sum] = "a557f389d692e75040f4b2e81fafe61a9a81425d2935ec43680e12c1e251ff6b"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
