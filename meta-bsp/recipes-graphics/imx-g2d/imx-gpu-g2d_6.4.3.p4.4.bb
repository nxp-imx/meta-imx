# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "702ced9616b35d9ca8c9a1ef276b1899"
SRC_URI[aarch64.sha256sum] = "f011ab1e5cce3454806a2f1d523a60baf9594ec79a3e5e8c495367a21404451d"
SRC_URI[arm.md5sum] = "e3f900b48a9d6b144c82302f251f0fbd"
SRC_URI[arm.sha256sum] = "8a9f08e6f3631a3a76cca29d85b77b384ef78f47036f9e68c8ed89ebd43390cd"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -r ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
