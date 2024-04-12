# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
IMX_BIN_NAME = "${BP}-${TARGET_ARCH}-${IMX_SRCREV_ABBREV}"
IMX_SRCREV_ABBREV = "e5cffa7"
SRC_URI[aarch64.md5sum] = "08ef8810ee0f4913ca715ef051baee82"
SRC_URI[aarch64.sha256sum] = "5ce75b83ef21735d8b2572b11498108a9e452fb9728355d2ce22889b51bfc4a8"
SRC_URI[arm.md5sum] = "592b4c01ebba4666355421095e5b9aaf"
SRC_URI[arm.sha256sum] = "9955fa26240e69382bd1036bbcfd12c90befbbaaf2089e24901435abf83e33a7"

S = "${WORKDIR}/${IMX_BIN_NAME}"

inherit fsl-eula-unpack

SOC_INSTALL_DIR               = "SOC_INSTALL_DIR_NOT_SET"
SOC_INSTALL_DIR:mx8mm-nxp-bsp = "mx8mm"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -d ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    if [ -d ${S}/g2d/usr/lib/${SOC_INSTALL_DIR} ]; then
        cp -d ${S}/g2d/usr/lib/${SOC_INSTALL_DIR}/*.so* ${D}${libdir}
    fi
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
}

# The packaged binaries have been stripped of debug info, so disable
# operations accordingly.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(imxgpu2d)"
