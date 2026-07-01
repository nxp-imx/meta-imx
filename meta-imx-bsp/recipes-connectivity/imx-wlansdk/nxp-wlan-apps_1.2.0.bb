# Copyright 2025 NXP

DESCRIPTION = "NXP WLAN app to get/set channel state information"
LICENSE = "Proprietary"
SECTION = "network"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "ee3bbaa"
SRC_URI[sha256sum] = "2f56224fafd8bd97b9e67762f37682c2becffd0a0a2761f6bb2d66960e38626d"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

INSANE_SKIP:${PN}-dbg += "buildpaths"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
