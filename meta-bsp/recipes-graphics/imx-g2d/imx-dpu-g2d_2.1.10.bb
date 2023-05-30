# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

DEPENDS = "libgal-imx libdrm"
PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;fsl-eula=true"
IMX_BIN_NAME = "${BP}-${IMX_SRCREV_ABBREV}"
IMX_SRCREV_ABBREV = "d029d4a"
SRC_URI[md5sum] = "2596214aeaa39474d0217f2d818da383"
SRC_URI[sha256sum] = "f708aa49beb91d0c094ffe3e508965f129a4400aabfd22fade59472a72127ebc"

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
