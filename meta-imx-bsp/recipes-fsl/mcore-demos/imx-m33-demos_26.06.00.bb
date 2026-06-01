# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8ulp.sha256sum] = "0ae3563ded6d20e6a9cb3f946e85a2a8c7a44b2a959749bf28eda311fdf6e257"

SRC_URI[imx93.sha256sum] = "aab95c8911d12e6acdfda9accbcb5dc083cc86ad0838757c4ab62e2ecc0ab99f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

