# Copyright 2019 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

DEPENDS = "opencv"

SRC_URI[md5sum] = "c8e93831c3f847d75f860eb95d90262f"
SRC_URI[sha256sum] = "82a445e35558f94cc208e36d246c18f5e0f7067732120d13e023a833b0ea40e7"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
