# Copyright 2017-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8mm.sha256sum] = "7fc7c23e1a1ff0fea834e469bcb74e9681046dbf17d2131d9c55e1eff7b4863e"
SRC_URI[imx8mq.sha256sum] = "7441a2190366f2a38495f74cb959aeec3dcf8764f9b2b749766ad7a4411890cd"

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mq-nxp-bsp)"

