# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8ulp.sha256sum] = "2279eefdb71bdabfb08b7bb51cb5683555806b7960070cd575fad3d070b4273a"

SRC_URI[imx93.sha256sum] = "aab95c8911d12e6acdfda9accbcb5dc083cc86ad0838757c4ab62e2ecc0ab99f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

