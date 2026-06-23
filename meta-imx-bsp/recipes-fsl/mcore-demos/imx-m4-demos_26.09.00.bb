# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx7ulp.sha256sum] = "23f071c5ab7bb664190f658a3cf91fef66f2e60f7bcee0e7beba248b441aac79"

SRC_URI[imx8mm.sha256sum] = "05e75ead477b2f73199161789c9935c114d039bd160097f3f24432b6064860d7"
SRC_URI[imx8mq.sha256sum] = "490a42fe91ca25145b93c5a2f4b98c5c9b41cbb21a68594e31de44194b9acf9d"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
