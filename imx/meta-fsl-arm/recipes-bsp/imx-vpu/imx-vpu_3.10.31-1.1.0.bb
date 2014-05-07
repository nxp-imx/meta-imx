# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'alpha' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-alpha.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}-alpha"

SRC_URI[md5sum] = "2b3bb15876a014c0ed362cb258508ca4"
SRC_URI[sha256sum] = "b2ec86784a70a1ff7ee8ff6c94f503d06ea83dff8c7942e7e7fe657b1968fe18"

COMPATIBLE_MACHINE = "(mx6)"
