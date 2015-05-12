# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"

SRC_URI[md5sum] = "fc5777059d1090278ddc5e6d4c576491"
SRC_URI[sha256sum] = "11a1b201344b939947d9a079e1075a1f61801142901da707a98fbbecd0455a1b"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' imx-gpu-viv-kernel ')
}

PACKAGE_FP_TYPE = "hardfp"
