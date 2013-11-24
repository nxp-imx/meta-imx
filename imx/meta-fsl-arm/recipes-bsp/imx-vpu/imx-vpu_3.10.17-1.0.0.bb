# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

inherit fsl-eula-unpack

PLATFORM_mx6 = "IMX6Q"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "adf03d89324ac6d379a4d787e1089bee"
SRC_URI[sha256sum] = "8c3f5b7bf5ceca599721e4247927e150ba85a3310efa6aff28ac3ccc264edb0b"

COMPATIBLE_MACHINE = "(mx6)"
