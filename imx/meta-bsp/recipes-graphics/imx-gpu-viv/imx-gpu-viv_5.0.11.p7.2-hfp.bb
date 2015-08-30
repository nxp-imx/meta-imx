# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "a1c95d77caacc320c11bdc1d2e6ac6d6"
SRC_URI[sha256sum] = "40801adf88f14402c556641fe5d6d733da27ad1c6bfaf29aa176ca4edd6c19b1"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' kernel-module-imx-gpu-viv ')
}

PACKAGE_FP_TYPE = "hardfp"
