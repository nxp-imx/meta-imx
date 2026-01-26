# Copyright 2017-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8mm.sha256sum] = "fd07b66367585f302c0ae17f42bae11909beef10bcd219f553bd16ceef731b58"
SRC_URI[imx8mq.sha256sum] = "ea07be9b4cb9fa3471b1a5302b0b3eb45e4d2284299cbf9ff68e2ce95855d2a7"

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mq-nxp-bsp)"

