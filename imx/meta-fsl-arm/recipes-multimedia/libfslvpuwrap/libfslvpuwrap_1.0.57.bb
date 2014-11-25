# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Freescale Multimedia VPU wrapper"
DEPENDS = "imx-vpu"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=93b784b1c11b3fffb1638498a8dde3f6"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e04e8f7f6a0cd460317d1b4666e74a86"
SRC_URI[sha256sum] = "b654de21b92765fcc9ecbb898e7f18068ef096e39ffe20429da9e0b0fac4c0d9"


inherit fsl-eula-unpack autotools pkgconfig

do_install_append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}/imx-mm
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl)"
