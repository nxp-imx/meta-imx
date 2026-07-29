# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx7ulp.sha256sum] = "bb50a7ad19510fe9da3470514f57d84b75103a2f959a512007f8382be34ef56d"

SRC_URI[imx8mm.sha256sum] = "e164f71cb4f84da6b5b7cc4d9b8c3af304ad3e269b842669447a028b9fcc2546"
SRC_URI[imx8mq.sha256sum] = "b565819e30ed964edc5e59df49a36bc7e881fe619b88d80d8411ff4fdbdebd17"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
