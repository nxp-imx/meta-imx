# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8ulp.sha256sum] = "d629fec2bf5dd50229b63bf67ae17c5985de4ef350d25d6aaca9eeee1b742ff0"

SRC_URI[imx93.sha256sum] = "d4f4d12f18b6e5548a3fa986faba2bcf45caeadbf1e0b722052192082173472a"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

