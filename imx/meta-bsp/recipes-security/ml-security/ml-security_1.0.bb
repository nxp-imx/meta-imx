# Copyright 2019 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

DEPENDS = "opencv"

SRC_URI[md5sum] = "3f2f63dfd8549dc8a34f5101b9f5e88f"
SRC_URI[sha256sum] = "f01cc337c207546a522f94072fba47d8d4efe6695300e83d7e318f0390653c87"

S = "${WORKDIR}/ml-security"

inherit fsl-eula2-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
