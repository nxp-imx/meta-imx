# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "fb0635883ba98c021d5e1d3707c053cf"
SRC_URI[sha256sum] = "95c5cc7f72d9c5542aa66f360d2d185f315bd28ec657dfda97bc65d6591335b9"

PACKAGE_FP_TYPE = "hardfp"
