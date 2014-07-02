# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "cc9afbaff410bdfd1709c8e81ae7607e"
SRC_URI[sha256sum] = "1d8c88afc506653356527ab2bb939acba0cee4bb5c903f86df371ce4e80596ff"

PACKAGE_FP_TYPE = "hardfp"
