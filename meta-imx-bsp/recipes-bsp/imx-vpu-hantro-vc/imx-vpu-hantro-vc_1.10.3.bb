# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359" 

SRC_URI[sha256sum] = "b6c26d844d8fb0b246cec1ba81c6fa541481e192404a66d630e60a1410fa63ed"
IMX_SRCREV_ABBREV = "30847b6"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
