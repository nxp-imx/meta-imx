# Copyright 2019-2021 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

DEPENDS = "opencv"

SRC_URI[md5sum] = "65833fea2bb270a1381c1ffc1a902c43"
SRC_URI[sha256sum] = "bc9c47b8b609dd2fbf27de0c89ad3ad4bb3684461272bd8b6d1b47677a6d318b"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES:${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS:${PN} = "bash"
