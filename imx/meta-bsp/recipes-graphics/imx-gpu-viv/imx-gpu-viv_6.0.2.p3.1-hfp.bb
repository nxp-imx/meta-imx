# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "2488d46b799825a2211d014f5791f8af"
SRC_URI[sha256sum] = "fc2d072e9c156d0006a40f2ff81755415ff66ddd68ee07843eabb057f9ba9653"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
