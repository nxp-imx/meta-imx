# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "1ddebb056a37496c4afb7530ec7258e2"
SRC_URI[sha256sum] = "87dc2924bc8bc240c551e3a3306e52c6613e96ad87bf98113a68da1df81368be"

python __anonymous () {
	if d.getVar('USE_GPU_VIV_MODULE', True) == '1':
           d.appendVar('RDEPENDS_imx-gpu-viv', ' kernel-module-imx-gpu-viv ')
}

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
