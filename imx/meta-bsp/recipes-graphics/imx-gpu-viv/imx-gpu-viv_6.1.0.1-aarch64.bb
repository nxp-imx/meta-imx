# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "ae7557ba78de6e0940edb578c0252e02"
SRC_URI[sha256sum] = "f07706f9db8f58ba0d02e5c0db4c029cf7f26bd9c1dab06b70b800e280031c7e"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
