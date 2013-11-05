# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

inherit fsl-eula-unpack

PLATFORM_mx6 = "IMX6Q"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "b697a6cb774330d77647b29c32ed82c8"
SRC_URI[sha256sum] = "89303be86a8ce22c1e29bae8c949132b1a391e7463114564205ec710ac9a4cfd"

COMPATIBLE_MACHINE = "(mx6)"
