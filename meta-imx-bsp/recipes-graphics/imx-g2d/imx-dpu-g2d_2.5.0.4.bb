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

IMX_SRCREV_ABBREV = "e29cea6"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.sha256sum] = "e7a9d3a89b7cbab805a6919b9eae8a9f8b7441cedf95593ca1747235e5a6265a"

IMX_SRCREV_ABBREV:imxmali = "5828811"
IMX_SRC_URI_NAME:imxmali = "v2"
SRC_URI[v2.sha256sum] = "61d3b0bede7165e6bda00dec64e06426d82ed06cf39c23b3ffc639e1da7793a0"

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
