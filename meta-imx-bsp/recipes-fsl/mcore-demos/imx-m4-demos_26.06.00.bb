# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx7ulp.sha256sum] = "1001a420db8627e0352e45cbd6bce9431232d446fa1597c43084a4ec813e7003"

SRC_URI[imx8mm.sha256sum] = "05e75ead477b2f73199161789c9935c114d039bd160097f3f24432b6064860d7"
SRC_URI[imx8mq.sha256sum] = "80c6feead64458fac69e7c5ef076ceead685b1974b71e0a0417f898be6409602"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
