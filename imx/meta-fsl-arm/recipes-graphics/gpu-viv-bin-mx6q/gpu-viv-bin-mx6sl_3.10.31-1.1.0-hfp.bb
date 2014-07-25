# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "1b2f179bf00ca599388d8c9a1d2c02ef"
SRC_URI[sha256sum] = "0805cb1862b4f01fc964e534649d5243463b5bc68df06323b7e9043d7a8c45c0"

PACKAGE_FP_TYPE = "hardfp"
