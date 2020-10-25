# Copyright 2019-2020 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

DEPENDS = "opencv"

SRC_URI[md5sum] = "933fc6fd993d0558128364787d459ed5"
SRC_URI[sha256sum] = "2c4aa7982f5dee49ff15cd63a236c17f513c01506c2faf6a5a4ca1b3140c7bba"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
