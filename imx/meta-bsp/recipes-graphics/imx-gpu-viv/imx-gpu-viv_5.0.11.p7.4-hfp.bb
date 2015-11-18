# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "1e8c5825176ed28a05ceace695a855ac"
SRC_URI[sha256sum] = "1c3a0dbb5ada264aacc74eeffd72d49ccf0383410d737fe29d45a6ca4a490aa9"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' kernel-module-imx-gpu-viv ')
}

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
