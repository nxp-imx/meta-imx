# Copyright 2019-2020 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

DEPENDS = "opencv"

SRC_URI[md5sum] = "90f7014f1e1f8ffade07329d0f9fcf8e"
SRC_URI[sha256sum] = "11af032a299e3e99fb2e138b51d0c52d6b408fced611319e691e8ef270e49a51"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
