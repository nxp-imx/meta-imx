# Copyright 2019-2021 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

DEPENDS = "opencv"

SRC_URI[md5sum] = "094d7fc797dd0f3de74498d0d7b87c6f"
SRC_URI[sha256sum] = "be0b2703e0c301c594fcfaf9722621473d7303109dac671276099346b2ab2866"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES:${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS:${PN} = "bash"
