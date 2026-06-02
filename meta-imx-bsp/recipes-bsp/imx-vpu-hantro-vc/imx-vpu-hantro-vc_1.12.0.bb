# Copyright 2019-2025 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "0bb6a5ca9e7df546650ea1247f4cade7debcf6e8549ed92c98c8412d80b1676b"
IMX_SRCREV_ABBREV = "1fd0ec5"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
