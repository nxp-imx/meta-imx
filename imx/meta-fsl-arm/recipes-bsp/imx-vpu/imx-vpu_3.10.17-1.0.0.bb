# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

inherit fsl-eula-unpack

PLATFORM_mx6 = "IMX6Q"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "14e6f4a46dd1cc1f567ecc29a552b79a"
SRC_URI[sha256sum] = "7ac88f11b95f93c544d38dc43af7969bbf3b88446856ba16cb307ac3a15d1961"

COMPATIBLE_MACHINE = "(mx6)"
