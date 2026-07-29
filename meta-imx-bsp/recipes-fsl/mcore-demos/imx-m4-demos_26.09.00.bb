# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI[imx7ulp.sha256sum] = "bb50a7ad19510fe9da3470514f57d84b75103a2f959a512007f8382be34ef56d"

SRC_URI[imx8mm.sha256sum] = "9a5ec2a8c4b983a29ad049d6e70b5a55b647806ae8c48d77d939ab0ac00eb7f1"
SRC_URI[imx8mq.sha256sum] = "7a2ef6aaea7391cc3f5ee12e4f52abd47706ba44442f1491bc69d253927293e8"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
