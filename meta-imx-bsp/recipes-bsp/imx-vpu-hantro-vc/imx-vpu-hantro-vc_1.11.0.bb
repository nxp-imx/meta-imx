# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "2ab93f2e62edee1de540e840ff852037ee3dd7b31ab5506b7f58cbc136b93210"
IMX_SRCREV_ABBREV = "0eec750"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
