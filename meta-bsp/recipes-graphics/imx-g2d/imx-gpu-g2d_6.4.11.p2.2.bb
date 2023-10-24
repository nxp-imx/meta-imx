# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
IMX_BIN_NAME = "${BP}-${TARGET_ARCH}-${IMX_SRCREV_ABBREV}"
IMX_SRCREV_ABBREV = "b869648"
SRC_URI[aarch64.md5sum] = "9b769977d477ef54a57609764f60e6eb"
SRC_URI[aarch64.sha256sum] = "c5e35ff045cd522302d3c91aee996bf22017a88a183ab34c05228c395a1812ac"
SRC_URI[arm.md5sum] = "2e2ef189ff3fcd9cbd013df24ec0dac6"
SRC_URI[arm.sha256sum] = "f99da80ec8b1dd77d742347f702fa431b65e3e0066f434a019c6d52eb32df26b"

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
