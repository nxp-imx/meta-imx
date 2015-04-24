# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "7b70730bacee2b30ff79126affe9aec3"
SRC_URI[sha256sum] = "3d477251376eaff27108910f80fa80f20a61fd368f381877b4e1540775c6abad"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}/"
