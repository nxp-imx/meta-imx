# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8ulp.md5sum] = "b781923dbbd315e87af0d69e640ba253"
SRC_URI[imx8ulp.sha256sum] = "78224892cfb964831855c03e314ebfdbaa10aee1d8f4e1b683e57e0a50e5d150"

SRC_URI[imx93.md5sum] = "b63358a6ed6f2b95c8196c54140b4a23"
SRC_URI[imx93.sha256sum] = "e87cd109bf4a20c5f28ea9e927d300f59386c0e2edeef95e2e3496882101469f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
