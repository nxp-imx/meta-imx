# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

DEPENDS = "libdrm ${LIBGAL_IMX}"
LIBGAL_IMX              = "libgal-imx"
LIBGAL_IMX:mx95-nxp-bsp = ""

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${IMX_BIN_NAME}.bin;fsl-eula=true${IMX_SRC_URI_NAME}"
IMX_BIN_NAME = "${BPN}${IMX_BIN_NAME_SUFFIX}-${PV}-${IMX_SRCREV_ABBREV}"

IMX_SRCREV_ABBREV = "da8b050"
IMX_BIN_NAME_SUFFIX = ""
IMX_SRC_URI_NAME = ""
SRC_URI[md5sum] = "24bd901c1a8de674b6417ad7df8395be"
SRC_URI[sha256sum] = "4d84f3d223a18bb94cdafd5cf5e19e1705ba88b5799c48ae19b6789ee73607e2"

IMX_SRCREV_ABBREV:mx95-nxp-bsp = "da8b050"
IMX_BIN_NAME_SUFFIX:mx95-nxp-bsp = "-mx95"
IMX_SRC_URI_NAME:mx95-nxp-bsp = ";name=mx95"
SRC_URI[mx95.md5sum] = "ef3a095a15281ff219b97d09b608d25a"
SRC_URI[mx95.sha256sum] = "f2954278cf261d2de93907ee7b45add114f05412ad861b0f3ad3d8f9085cd255"

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
