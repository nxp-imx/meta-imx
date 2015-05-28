# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.tar.gz \
            file://rc.autohdmi"

SRC_URI[md5sum] = "42d1f012dc57ce3dc18e688e257846fa"
SRC_URI[sha256sum] = "37354ea17bf0c9206f61076e928fb60313872fac18da0b09cbe447292b465307"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}/"

COMPATIBLE_MACHINE = "(mx6q:mx6dl:mx6sx:mx6sl)"
