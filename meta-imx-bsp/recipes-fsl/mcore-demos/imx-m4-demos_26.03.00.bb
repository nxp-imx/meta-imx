# Copyright 2017-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8mm.sha256sum] = "0efd56d2e7b0754d6880ed9de610ca79535fb450b63bfd6f0a33d3f00f6cd8c4"
SRC_URI[imx8mq.sha256sum] = "ea07be9b4cb9fa3471b1a5302b0b3eb45e4d2284299cbf9ff68e2ce95855d2a7"

COMPATIBLE_MACHINE = "(mx8mm-nxp-bsp|mx8mq-nxp-bsp)"

