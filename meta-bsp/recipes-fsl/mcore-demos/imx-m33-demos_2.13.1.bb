# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI[imx8ulp.md5sum] = "90e86a04da14fa2c5edca03e46137f62"
SRC_URI[imx8ulp.sha256sum] = "3dccb74ffa7589c501bf769e8e4c652bbd43a44fc4261111dc487cd1c7b863ef"

SRC_URI[imx93.md5sum] = "dd9d0d8b46c089f1f9dd61ba4f8e7d18"
SRC_URI[imx93.sha256sum] = "c6f6c13abba24dcc92e1015674850c86785b9ab60f4e32ccc0aae939d277e16f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
