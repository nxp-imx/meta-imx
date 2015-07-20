# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e321f2426e6416e5f273c1a315c615d0"
SRC_URI[sha256sum] = "fc1c22507ea853666916f454f24f9de23cd5fb0a312b6f3ed3989c8a68e62da0"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' kernel-module-imx-gpu-viv ')
}

PACKAGE_FP_TYPE = "hardfp"
