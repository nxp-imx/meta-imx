# Copyright 2019-2021 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

DEPENDS = "opencv"

SRC_URI[md5sum] = "5f789532f11e5085278cbb637d7927d0"
SRC_URI[sha256sum] = "44b5a43e1cbd2c34245a45798db35ad080e586a81a940771a6b9a75af310d0d1"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
