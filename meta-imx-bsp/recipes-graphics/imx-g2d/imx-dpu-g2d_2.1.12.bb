# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

DEPENDS = "libdrm ${LIBGAL_IMX}"
LIBGAL_IMX              = "libgal-imx"
LIBGAL_IMX:mx95-nxp-bsp = ""

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;fsl-eula=true;name=${IMX_SRC_URI_NAME}"
IMX_BIN_NAME = "${BPN}-${IMX_SRC_URI_NAME}-${PV}-${IMX_SRCREV_ABBREV}"

IMX_SRCREV_ABBREV = "da8b050"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.md5sum] = "e92010234d8e094214731b9e8d38c498"
SRC_URI[v1.sha256sum] = "d9cf34a68a6c5843020da80358d5c08ca60868e2572724980db038ad5cff5952"

IMX_SRCREV_ABBREV:mx95-nxp-bsp = "da8b050"
IMX_SRC_URI_NAME:mx95-nxp-bsp = "v2"
SRC_URI[v2.md5sum] = "e24f3a3bb7156acd39e1d963d892c09a"
SRC_URI[v2.sha256sum] = "508a933db90fc50077e5d05da1b4b89b173ea4baa11328a8f68dc821b29e9d4b"

S = "${WORKDIR}/${IMX_BIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -d ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
}

# The packaged binaries have been stripped of debug info, so disable
# operations accordingly.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

COMPATIBLE_MACHINE = "(imxdpu)"
