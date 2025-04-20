# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"

SRC_URI[sha256sum] = "1583390edda9048aff3566b231f7e38c1185f41dba4e464bfeb5fe08ab1922f8"
IMX_SRCREV_ABBREV = "fc03682"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
