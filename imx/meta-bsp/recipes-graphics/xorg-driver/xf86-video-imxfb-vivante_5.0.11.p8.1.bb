# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=26;md5=ecb1a30055169dfee70ba94b6eb1e151"

SRC_URI[md5sum] = "910137fc19dc93bdf88ba3eaa44acbde"
SRC_URI[sha256sum] = "61b2a0af4511caacaae59e2d857c087dde09661f734d5b2ab2f39c6feb82c29e"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
