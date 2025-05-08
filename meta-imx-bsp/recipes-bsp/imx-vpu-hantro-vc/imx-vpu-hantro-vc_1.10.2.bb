# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"

SRC_URI[sha256sum] = "b4d7968a0c3b51f592eea060b6f26c1e1bee8bc6d2083f041b782ef16221a931"
IMX_SRCREV_ABBREV = "fc03682"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
