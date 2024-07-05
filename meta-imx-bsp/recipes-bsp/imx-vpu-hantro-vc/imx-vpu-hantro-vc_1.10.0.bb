# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[sha256sum] = "6088208d313606deea98b2c6cd7f183b60ba16295bb83b7eb03b74b22073c7d1"
IMX_SRCREV_ABBREV = "1f2f5e5"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
