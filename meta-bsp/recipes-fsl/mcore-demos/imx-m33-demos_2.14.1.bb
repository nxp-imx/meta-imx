# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"
LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8ulp.md5sum] = "e44631b2d0f39a1d062e5eacfc1a08ae"
SRC_URI[imx8ulp.sha256sum] = "bb94a035cac226617dd15b218b397b4eb2d12749610f9b7be6fb9e63363e06ea"

SRC_URI[imx93.md5sum] = "5eb97a5afed0aafda98ea5bdc665811c"
SRC_URI[imx93.sha256sum] = "54ca75f62baf0f197f77837822fe8fb0e4fa2e2450c81dca60d24ca5f59d48bd"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
