# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1142bc333cf4971d6b10bd8292363f02" 

DEPENDS = "libdrm ${LIBGAL_IMX}"
LIBGAL_IMX              = "libgal-imx"
LIBGAL_IMX:mx95-nxp-bsp = ""

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;fsl-eula=true;name=${IMX_SRC_URI_NAME}"
IMX_BIN_NAME = "${BPN}-${IMX_SRC_URI_NAME}-${PV}-${IMX_SRCREV_ABBREV}"

IMX_SRCREV_ABBREV = "6eca64c"
IMX_SRC_URI_NAME = "v1"
SRC_URI[v1.md5sum] = "fe933cdb746c3aaa9f216f50523350b7"
SRC_URI[v1.sha256sum] = "c016a3e17256ce3451ceab02a4a3feb6d4fc2e67d64637d9ee9bc2a67d4a970c"

IMX_SRCREV_ABBREV:mx95-nxp-bsp = "6eca64c"
IMX_SRC_URI_NAME:mx95-nxp-bsp = "v2"
SRC_URI[v2.md5sum] = "248343273b5555f519af53558e6d1e05"
SRC_URI[v2.sha256sum] = "dfbbf16a620aea9c26c234b28d317f3b25912cbc1b12ebbe9df98c24d55bc69d"

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
