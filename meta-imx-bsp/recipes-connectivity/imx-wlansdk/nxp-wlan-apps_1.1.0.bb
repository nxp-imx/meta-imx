# Copyright 2025 NXP

DESCRIPTION = "NXP WLAN app to get/set channel state information"
LICENSE = "Proprietary"
SECTION = "network"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "cf634d4"
SRC_URI[sha256sum] = "8548344efca0d6731a2a85e7b9a38bd5e0f9a6075b571da6f0c121a2958210cd"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

INSANE_SKIP:${PN}-dbg += "buildpaths"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
