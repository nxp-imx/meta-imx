# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

DEPENDS = "libdrm ${LIBGAL_IMX}"
LIBGAL_IMX        = ""
LIBGAL_IMX:imxviv = "libgal-imx"

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;fsl-eula=true;name=${IMX_SRC_URI_NAME}"
IMX_BIN_NAME = "${BPN}-${IMX_SRC_URI_NAME}-${PV}-${IMX_SRCREV_ABBREV}"

IMX_SRCREV_ABBREV = "ebfe2a6"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.sha256sum] = "f5ae54d49aed980f2cce79cca9060c9a2e9bfa4713ac275b4956adda53f9e987"

IMX_SRCREV_ABBREV:imxmali = "ebfe2a6"
IMX_SRC_URI_NAME:imxmali = "v2"
SRC_URI[v2.sha256sum] = "e7c4a2bd912527021b7b5b35d700f251d9d2b1123e02093f001d61b7862e85dc"

S = "${UNPACKDIR}/${IMX_BIN_NAME}"

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
