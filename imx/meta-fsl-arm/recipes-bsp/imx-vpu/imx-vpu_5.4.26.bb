# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "fa1f2a99b8bd5b05d5f914fd071ef550"
SRC_URI[sha256sum] = "9dd9cfea4b1df030b6d4c3f5c8c5ca15e6226fcf1de26f94fab2d2c79feb634c"

COMPATIBLE_MACHINE = "(mx6)"
