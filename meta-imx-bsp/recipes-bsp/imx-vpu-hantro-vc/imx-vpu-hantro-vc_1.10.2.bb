# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 

SRC_URI[sha256sum] = "382c33c804eb4f0800e106685d25838c349aaeb3c9798b98b89dc862d5331e01"
IMX_SRCREV_ABBREV = "fc03682"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
