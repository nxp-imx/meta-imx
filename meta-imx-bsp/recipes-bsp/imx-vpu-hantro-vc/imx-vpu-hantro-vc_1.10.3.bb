# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359" 

SRC_URI[sha256sum] = "663815ea15e5f8da3ee863d36de46f79d2de1a3f373a802e72ec5307ce207adf"
IMX_SRCREV_ABBREV = "3fa3063"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
