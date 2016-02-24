# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "2ca535f75c84ee28b09c6a3db0749257"
SRC_URI[sha256sum] = "7a241fef255acc2695d787e0512bf6a86aab4178d4f054191a3ee78b6d35d1f7"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
