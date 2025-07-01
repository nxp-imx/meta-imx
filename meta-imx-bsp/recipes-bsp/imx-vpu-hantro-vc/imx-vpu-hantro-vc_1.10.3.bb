# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "b62f7b52525bef049b56bda34346f4560262342db58783af8c6bbcbbaaf404a0"
IMX_SRCREV_ABBREV = "30847b6"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
