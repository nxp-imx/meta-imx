# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "a6eb0c6fd59794d8b66ee63c2e2756a8"
SRC_URI[sha256sum] = "914843d75213dda6e84742d7985cbf26c247d7ec39f59ad6550711efc67b0968"

PACKAGE_FP_TYPE = "hardfp"
