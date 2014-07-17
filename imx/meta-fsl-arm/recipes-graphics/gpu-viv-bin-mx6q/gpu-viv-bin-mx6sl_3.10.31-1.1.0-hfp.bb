# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "c693ad17626187cdc37e11cc7614d6cc"
SRC_URI[sha256sum] = "a440740bd0838c0316ae9983a3f369770f4bbc6b8fb4e0862956d0ad59592cc7"

PACKAGE_FP_TYPE = "hardfp"
