# Copyright (C) 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'alpha' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_alpha.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}_alpha"

SRC_URI[md5sum] = "c238803f7fd779dcb8405115bb7495b2"
SRC_URI[sha256sum] = "71f603eb26285007b8a1308c2b0a81de2d5154210e84574a9464f6fd4b3d5904"

COMPATIBLE_MACHINE = "(mx6)"
