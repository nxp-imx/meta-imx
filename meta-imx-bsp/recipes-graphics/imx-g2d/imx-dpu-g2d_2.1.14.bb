# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

DEPENDS = "libdrm ${LIBGAL_IMX}"
LIBGAL_IMX              = "libgal-imx"
LIBGAL_IMX:mx95-nxp-bsp = ""

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;fsl-eula=true;name=${IMX_SRC_URI_NAME}"
IMX_BIN_NAME = "${BPN}-${IMX_SRC_URI_NAME}-${PV}-${IMX_SRCREV_ABBREV}"

IMX_SRCREV_ABBREV = "98af447"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.md5sum] = "a2c1036cca0a06800e88aa95ce5ef408"
SRC_URI[v1.sha256sum] = "8c4be977ea497ddc25de6a4b0c0a7a476b950acfcf3eb89d136cb676df64b149"

IMX_SRCREV_ABBREV:mx95-nxp-bsp = "32e0525"
IMX_SRC_URI_NAME:mx95-nxp-bsp = "v2"
SRC_URI[v2.md5sum] = "21dec7e1323354f6e9b01e6aa2a54e82"
SRC_URI[v2.sha256sum] = "9cb830104abf22fa3f89150dacff5306b089ef0ac956ab5066fc746879d95f4b"

S = "${WORKDIR}/${IMX_BIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -d ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
}

INSANE_SKIP:append:libc-musl = " file-rdeps"
RDEPENDS:${PN}:append:libc-musl = " gcompat"

# The packaged binaries have been stripped of debug info, so disable
# operations accordingly.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(imxdpu)"
