# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI[imx8ulp.md5sum] = "849871405542b02a50dfdd0a16ff3fa0"
SRC_URI[imx8ulp.sha256sum] = "030824e6f5bc00207689d9a892f8e0f43fd8fa64ab410b4652f6df7d530398f7"

SRC_URI[imx93.md5sum] = "dd9d0d8b46c089f1f9dd61ba4f8e7d18"
SRC_URI[imx93.sha256sum] = "c6f6c13abba24dcc92e1015674850c86785b9ab60f4e32ccc0aae939d277e16f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
