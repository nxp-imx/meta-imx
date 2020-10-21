# Copyright 2019-2020 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

DEPENDS = "opencv"

SRC_URI[md5sum] = "56fbd223cfa0e6e77e0502bd323929b4"
SRC_URI[sha256sum] = "3c6caea8ae6e627a7ba271eff05cc5cbf0c2c12a925c3c01107feaa7a043a052"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
