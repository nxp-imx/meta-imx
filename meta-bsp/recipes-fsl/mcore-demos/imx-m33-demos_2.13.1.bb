# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8ulp.md5sum] = "b781923dbbd315e87af0d69e640ba253"
SRC_URI[imx8ulp.sha256sum] = "78224892cfb964831855c03e314ebfdbaa10aee1d8f4e1b683e57e0a50e5d150"

SRC_URI[imx93.md5sum] = "a03cfb6d56b8e9526c0461bbaf6a1096"
SRC_URI[imx93.sha256sum] = "50e2fe3d3c32b189389fbe3482c654fd69af225cd3cffbe754543a2f13f4cee5"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
