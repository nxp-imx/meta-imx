# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "7998a1b8d956aa40d038ba2cf82aec95"
SRC_URI[sha256sum] = "1174e9fc43f9de6dc2292ccc3987c5ed285a86bdae72ccea8ca6427483ba2adc"

PACKAGE_FP_TYPE = "hardfp"
