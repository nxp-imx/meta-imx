# Copyright 2019 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

DEPENDS = "opencv"

SRC_URI[md5sum] = "5d071460a06057af29cecfcec610d33d"
SRC_URI[sha256sum] = "71c03a392aacdcc6d485e9001d7911c24d4b90cdbc4b878743bc99ce4625c3dc"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
