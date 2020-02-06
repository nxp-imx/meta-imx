# Copyright 2019 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

DEPENDS = "opencv"

SRC_URI[md5sum] = "410ce3a8cc53210c1af0590871ca2941" 
SRC_URI[sha256sum] = "82fb6f30f861a97eb62e01e2acbb07d567eeaac4ee70207928e1dfb212c28f26"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
