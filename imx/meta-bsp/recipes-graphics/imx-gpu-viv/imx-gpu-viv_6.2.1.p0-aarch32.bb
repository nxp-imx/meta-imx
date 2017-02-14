# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "288df778212690fbe1258e83dd564d5b"
SRC_URI[sha256sum] = "b6ea9edf39d907892a2e067f110664bba2e16256289d83df532881dd7d831701"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx7ulp)"
