# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1142bc333cf4971d6b10bd8292363f02" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
IMX_BIN_NAME = "${BP}-${TARGET_ARCH}-${IMX_SRCREV_ABBREV}"
IMX_SRCREV_ABBREV = "c3931da"
SRC_URI[aarch64.md5sum] = "8fa1c326698ba3b4ed0fecdf4ab78e78"
SRC_URI[aarch64.sha256sum] = "70fb9b1dee189713871ee07e3001671513bba0634a2d1b0aa54e76e8c77075cc"
SRC_URI[arm.md5sum] = "43946d77e1903d92f2a44837fa3e6a4b"
SRC_URI[arm.sha256sum] = "6a5057a221dfdab660e9d287d27c11bd055bd258c3f3dc44b71582c33df106a4"

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
