# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx7ulp.sha256sum] = "55adef1341ec2fe80117eeecb178b8573fb7a09c1cbe4625b5a78225d3512cd3"

SRC_URI[imx8mm.sha256sum] = "147711511a9a2e4a74c25021cc5930936a0602a757bc5825ecb3e1672628d921"
SRC_URI[imx8mq.sha256sum] = "80c6feead64458fac69e7c5ef076ceead685b1974b71e0a0417f898be6409602"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
