# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "349945e15acdc43e4e541ea9046c4ceb"
SRC_URI[sha256sum] = "c21d29eb92c27368a7e725259209dbb64406b4c4cae6556c52f5c0c6d9fffee8"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}/"
