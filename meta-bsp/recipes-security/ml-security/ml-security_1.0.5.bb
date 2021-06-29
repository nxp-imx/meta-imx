# Copyright 2019-2021 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

DEPENDS = "opencv"

SRC_URI[md5sum] = "65833fea2bb270a1381c1ffc1a902c43"
SRC_URI[sha256sum] = "bc9c47b8b609dd2fbf27de0c89ad3ad4bb3684461272bd8b6d1b47677a6d318b"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
