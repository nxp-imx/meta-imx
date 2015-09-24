# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "634122a530b54658b66a6b38e4db92a7"
SRC_URI[sha256sum] = "6c85e29d1c5baca89af612d6ff589682ecdfa771cd7c670dc7b2d9b12fff11ad"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' kernel-module-imx-gpu-viv ')
}

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
