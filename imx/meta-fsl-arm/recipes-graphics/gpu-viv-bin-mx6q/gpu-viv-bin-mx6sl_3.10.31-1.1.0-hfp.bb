# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "3ddad77430bea83188163a18f569f9fc"
SRC_URI[sha256sum] = "e8da9aef17ad5fe44e2de87e9ef0cfe00da7206b24be813ae528a62dba5b69a8"

PACKAGE_FP_TYPE = "hardfp"
