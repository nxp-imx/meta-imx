# Copyright 2019-2025 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "2897c4401ec0a1154495336b915fc79f454b6e0d5bd134d95150d2f1cb8779e5"
IMX_SRCREV_ABBREV = "1fd0ec5"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
