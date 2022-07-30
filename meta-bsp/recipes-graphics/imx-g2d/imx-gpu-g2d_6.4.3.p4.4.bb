# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "8672e4d67cb7cfcf1a649f7a61dfec3e"
SRC_URI[aarch64.sha256sum] = "9d9d3c682260f766d46ec16656b2b078fe6a2e5e2a069c7cc40bafd521bc71df"
SRC_URI[arm.md5sum] = "a45e2a4c6c3d78e9479d5ce984949848"
SRC_URI[arm.sha256sum] = "a1a404c6bb48ffc208f0ad3798fdaf30b37fe5c71eeaa46c34326ac79b9b28ff"

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
