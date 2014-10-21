# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "6118874c73fe1c95569f22610c4aaee3"
SRC_URI[sha256sum] = "6ed41bfb1ecc1a5e7d35676f0d1fca2b9be95343222d09c200d01999e9681869"

COMPATIBLE_MACHINE = "(mx6)"
