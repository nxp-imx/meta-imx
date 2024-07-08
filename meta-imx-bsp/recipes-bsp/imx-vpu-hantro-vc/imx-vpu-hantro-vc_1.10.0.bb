# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[sha256sum] = "c53e9c291da253416a37d5ca454a300e81cf3e1ee54afcf69ceca7900d7eb4ba"
IMX_SRCREV_ABBREV = "1f2f5e5"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
