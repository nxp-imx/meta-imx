# Copyright 2019 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

DEPENDS = "opencv"

SRC_URI[md5sum] = "ef027adb32f5ffeb275447ccfb2de915"
SRC_URI[sha256sum] = "7a52cba6fcccccd7824f4ebae45fce3fab4ca5bbb81f88cde27bbf79ceb652c2"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
