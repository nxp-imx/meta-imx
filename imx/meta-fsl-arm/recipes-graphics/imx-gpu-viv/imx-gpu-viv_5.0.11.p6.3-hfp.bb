# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"

SRC_URI[md5sum] = "137c5d9a4e13e8ad1afc130ef36c0e62"
SRC_URI[sha256sum] = "3e0eb7ff099f99b804de7cd645374816ba073d9b34db430c2a1ab7a8549b278d"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' imx-gpu-viv-kernel ')
}

PACKAGE_FP_TYPE = "hardfp"
