# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
IMX_BIN_NAME = "${BP}-${TARGET_ARCH}-${IMX_SRCREV_ABBREV}"
IMX_SRCREV_ABBREV = "ce27226"
SRC_URI[aarch64.sha256sum] = "407882e63ed8da0d0d0c84e38ad5a7ca779c27133fbe2fbcfa35a50100823fd5"
SRC_URI[arm.sha256sum] = "1613022bdf7575c6d8742784b64ef3290e200e1012262ce40d87faeda9f179fe"

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
