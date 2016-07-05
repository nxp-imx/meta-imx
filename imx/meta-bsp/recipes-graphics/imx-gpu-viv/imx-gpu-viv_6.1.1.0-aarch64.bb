# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "2256e3ca521b7d2ffab4aebc4045ce2c"
SRC_URI[sha256sum] = "b208d1ea9cd161d9b08e0aaa36fed19ba17284481ba29a5f42cc7861ba621348"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
