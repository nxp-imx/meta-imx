# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "03a22501d66ebe52604b063e0674d508"
SRC_URI[sha256sum] = "0c301958bcdcba052ee1a0f865b725a948e0c09b59e64b47fc07bb8c09501c61"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
