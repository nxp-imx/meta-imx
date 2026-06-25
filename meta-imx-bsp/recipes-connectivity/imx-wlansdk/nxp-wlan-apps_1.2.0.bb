# Copyright 2025 NXP

DESCRIPTION = "NXP WLAN app to get/set channel state information"
LICENSE = "Proprietary"
SECTION = "network"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "f0a9ce3"
SRC_URI[sha256sum] = "06f9bdbc82738e74a8b67ec303f20c2cf28fe2040450595b496eb112af4c4a57"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

INSANE_SKIP:${PN}-dbg += "buildpaths"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
