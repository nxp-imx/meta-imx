# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "0ce1f505e9756b63f7675b8a6d35e0db"
SRC_URI[sha256sum] = "813552fe4ba16c25ac28cbdbb740df8eb8ad26986051f1a531499bb9cf75ff6c"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
