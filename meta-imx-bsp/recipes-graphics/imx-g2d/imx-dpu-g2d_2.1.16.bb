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

IMX_SRCREV_ABBREV = "0053184"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.md5sum] = "63295eed57277fbb66c4ae8edd4d5eb7"
SRC_URI[v1.sha256sum] = "de12592b8bf70a18b2eadcf8fec673dbb43b9fc4c1078ced9a33e6cf6490c0b0"

IMX_SRCREV_ABBREV:mx95-nxp-bsp = "0053184"
IMX_SRC_URI_NAME:mx95-nxp-bsp = "v2"
SRC_URI[v2.md5sum] = "b1a9d0439655397adbc219a8557eaad9"
SRC_URI[v2.sha256sum] = "85a32d18e1b0d912a82ea76161e6975de2da5445253e16eb3e4f2f5f3449255d"

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
