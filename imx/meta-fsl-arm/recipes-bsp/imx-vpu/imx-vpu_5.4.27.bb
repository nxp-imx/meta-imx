# Copyright (C) 2013, 2014 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc

PE = "1"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "4d2e9acab11dd0b8f251f4e2fa30cf43"
SRC_URI[sha256sum] = "76a33f46ff11b4d79263b1815527df679475323a5e96bb81e435fb52948d4cd2"

COMPATIBLE_MACHINE = "(mx6)"
