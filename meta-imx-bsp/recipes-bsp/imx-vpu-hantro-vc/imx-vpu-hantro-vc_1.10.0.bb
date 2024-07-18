# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

SRC_URI[sha256sum] = "79701fad7756e92106c131b54570115059e36dd44a6d26131fe7fbcdc2f4d26a"
IMX_SRCREV_ABBREV = "1f2f5e5"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
