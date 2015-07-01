# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e77a132b0e1d61b1c14fac3698c5ced0"
SRC_URI[sha256sum] = "e56b4ae790ecbcf9228a2d1bf2f2cbff2c6bb187213afb25f4efa7eed4c611b8"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' imx-gpu-viv-kernel ')
}

PACKAGE_FP_TYPE = "hardfp"
