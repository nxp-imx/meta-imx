# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI[imx8ulp.md5sum] = "90e86a04da14fa2c5edca03e46137f62"
SRC_URI[imx8ulp.sha256sum] = "3dccb74ffa7589c501bf769e8e4c652bbd43a44fc4261111dc487cd1c7b863ef"

SRC_URI[imx93.md5sum] = "a03cfb6d56b8e9526c0461bbaf6a1096"
SRC_URI[imx93.sha256sum] = "50e2fe3d3c32b189389fbe3482c654fd69af225cd3cffbe754543a2f13f4cee5"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
