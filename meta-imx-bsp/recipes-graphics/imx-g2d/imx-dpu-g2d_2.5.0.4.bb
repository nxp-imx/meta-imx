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

IMX_SRCREV_ABBREV = "3669243"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.sha256sum] = "ae61a44aa61e080108c689798f564ed785a1335a42c937b8117a2b8c9ffa2517"

IMX_SRCREV_ABBREV:imxmali = "3669243"
IMX_SRC_URI_NAME:imxmali = "v2"
SRC_URI[v2.sha256sum] = "b8a27ceb810b70be270db5a5a39a3941262ada944f5f59db8e1e462baed347c6"

IMX_SRCREV_ABBREV:mx952-nxp-bsp = "1355d5c"
IMX_SRC_URI_NAME:mx952-nxp-bsp = "v3"
SRC_URI[v3.sha256sum] = "ad87ff10386b58c66dd637d867b3faf39290fae882444df3dbb69914775b4f82"

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
