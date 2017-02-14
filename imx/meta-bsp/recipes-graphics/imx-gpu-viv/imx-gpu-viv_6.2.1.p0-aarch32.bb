# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "5ec40bf32dbda685a6057dca2fa78853"
SRC_URI[sha256sum] = "7545ae08ceaaf00979209b08d7bb29a5092a7d35db6b40e801d16866d0bf765c"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx7ulp)"
