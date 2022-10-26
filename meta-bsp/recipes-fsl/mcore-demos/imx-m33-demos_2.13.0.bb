# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8ulp.md5sum] = "e33ba7ecedbb9eb37a6d85d2c58b93c0"
SRC_URI[imx8ulp.sha256sum] = "58cd885a5248f3f369cb4305b856f85d00d6215a2a18298c8dbd9aa810983f3e"

SRC_URI[imx93.md5sum] = "b63358a6ed6f2b95c8196c54140b4a23"
SRC_URI[imx93.sha256sum] = "e87cd109bf4a20c5f28ea9e927d300f59386c0e2edeef95e2e3496882101469f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
