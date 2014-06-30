# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}-beta"

SRC_URI[md5sum] = "7014ee1a40844abff98c8e91331aaa4a"
SRC_URI[sha256sum] = "3fcdda0d3675ad3b7ace3ce3945f5dd4fa77ded85435d90b164114d6b34db524"

COMPATIBLE_MACHINE = "(mx6)"
