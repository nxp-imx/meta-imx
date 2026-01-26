# Copyright 2023-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8ulp.sha256sum] = "dcafb6989b1bf58ae5fef5b77c12007aa2eef6c02656b6ba13078579e222e2a8"

SRC_URI[imx93.sha256sum] = "a786a9c60c8b5b5444701e3e182922c51464de5c0cb1ce68df1575b16473f3b5"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

