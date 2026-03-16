# Copyright 2025 NXP

DESCRIPTION = "NXP WLAN app to get/set channel state information"
LICENSE = "Proprietary"
SECTION = "network"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "6b5e43f"
SRC_URI[sha256sum] = "a77db1683908bde09c15169a5b20c15c6afb6b423fd10b8bafd49de434dc3c6a"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

INSANE_SKIP:${PN}-dbg += "buildpaths"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
