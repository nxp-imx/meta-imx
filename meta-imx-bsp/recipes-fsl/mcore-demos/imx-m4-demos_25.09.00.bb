# Copyright 2017-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8mm.sha256sum] = "b478f9f3f804d5c31f7702c2f8b612d1782145d35a031ba7a5e392159568402b"
SRC_URI[imx8mq.sha256sum] = "445812ec07ca44160d70cd288f7dadc963893424bc8eab6e85058bede045497a"

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mq-nxp-bsp)"

