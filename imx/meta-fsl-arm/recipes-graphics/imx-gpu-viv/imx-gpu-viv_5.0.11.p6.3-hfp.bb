# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"

SRC_URI[md5sum] = "fc6fe63756453087bda15abdd762b720"
SRC_URI[sha256sum] = "29539625102bac4a538dc11a099b2e52757b1d8106e3a8ffd2ec0cf7b114c72d"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' imx-gpu-viv-kernel ')
}

PACKAGE_FP_TYPE = "hardfp"
