# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "240ac660d4684ef9afbaab1b450f36f4"
SRC_URI[sha256sum] = "bab44a942927e31537c7e531c8975b2d93e853733badb571e8acf09743e64a62"

COMPATIBLE_MACHINE = "(mx6)"
