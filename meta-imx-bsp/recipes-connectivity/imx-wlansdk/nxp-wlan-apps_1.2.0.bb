# Copyright 2025 NXP

DESCRIPTION = "NXP WLAN app to get/set channel state information"
LICENSE = "Proprietary"
SECTION = "network"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "5a60d37"
SRC_URI[sha256sum] = "90274d5910b30e732dd9cf4b894536e0d18b485f7d248db81996d2fb15aafa91"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

INSANE_SKIP:${PN}-dbg += "buildpaths"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
