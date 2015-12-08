# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "ce8e0d7b39d0a492e83e11780ff4a28e"
SRC_URI[sha256sum] = "fd5547627ae7f509ec9eec5862860ba8d04df21f601d2f4a7b59dc0e99723304"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
