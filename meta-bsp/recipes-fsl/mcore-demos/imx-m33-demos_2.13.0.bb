# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8ulp.md5sum] = "8fa4f26d623dbbeb9d6c77035edd2d60"
SRC_URI[imx8ulp.sha256sum] = "3914c6c3e89b055227efb36a998cff9176232346b7b9d5f9c89ef7ad6f968751"

SRC_URI[imx93.md5sum] = "b63358a6ed6f2b95c8196c54140b4a23"
SRC_URI[imx93.sha256sum] = "e87cd109bf4a20c5f28ea9e927d300f59386c0e2edeef95e2e3496882101469f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
