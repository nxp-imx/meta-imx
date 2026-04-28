# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx7ulp.sha256sum] = "55adef1341ec2fe80117eeecb178b8573fb7a09c1cbe4625b5a78225d3512cd3"

SRC_URI[imx8mm.sha256sum] = "fd07b66367585f302c0ae17f42bae11909beef10bcd219f553bd16ceef731b58"
SRC_URI[imx8mq.sha256sum] = "96eed93c394d4e6263a8636c906bba7cc0fec17b28512f84a14ceb000a34eb62"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
