# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "eda189af30aca48505139874cc206d16"
SRC_URI[sha256sum] = "057a1817fb832b39250b5ec2b2381ed77d4e88b275574c1579773bcb87090c7d"

PACKAGE_FP_TYPE = "hardfp"
