# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "28ce7b8fac77711033d13dc684ab7120"
SRC_URI[sha256sum] = "ee1565e3e37b66fb90a159cd2e22053c377a1296ae98383451d573e69206eeb1"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
