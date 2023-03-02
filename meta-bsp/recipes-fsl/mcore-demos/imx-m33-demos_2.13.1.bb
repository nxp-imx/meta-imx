# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI[imx8ulp.md5sum] = "f76e829152d3d704b3e16d96a077aac2"
SRC_URI[imx8ulp.sha256sum] = "83e8612e687fa337e763152bc1a9add1cbf154cc19b329273d5f74252ebfb1b2"

SRC_URI[imx93.md5sum] = "dd9d0d8b46c089f1f9dd61ba4f8e7d18"
SRC_URI[imx93.sha256sum] = "c6f6c13abba24dcc92e1015674850c86785b9ab60f4e32ccc0aae939d277e16f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
