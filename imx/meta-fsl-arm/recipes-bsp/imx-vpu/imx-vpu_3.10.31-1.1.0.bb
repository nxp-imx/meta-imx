# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}-beta"

SRC_URI[md5sum] = "91f95f1e3c9e38a204af26ad25701ee1"
SRC_URI[sha256sum] = "64c2237d1a423b53871e94a6138c1f8d99e7d3972c2dac28cd67823448bb3697"

COMPATIBLE_MACHINE = "(mx6)"
