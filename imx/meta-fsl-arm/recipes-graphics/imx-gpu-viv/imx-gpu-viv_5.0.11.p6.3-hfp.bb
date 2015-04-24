# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"

SRC_URI[md5sum] = "845fe2f025bf6aa503a6885149b334de"
SRC_URI[sha256sum] = "90eb531e6569648c8bc0273079bb859ffac39bfe6d36063b0f49b9557a7be2c5"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' imx-gpu-viv-kernel ')
}

PACKAGE_FP_TYPE = "hardfp"
