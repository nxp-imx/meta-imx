# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "ad05ae7ee41187709d3fca3aec445c04"
SRC_URI[aarch64.sha256sum] = "1d3d55427501a9f758e39241f3ab414e489421dd2b5455153800d1864ab49d8d"
SRC_URI[arm.md5sum] = "8b435bba3f8185d6a6c70c1979a323c7"
SRC_URI[arm.sha256sum] = "2de57c8c535eb962f789a74f1f9c3784791b62400c4183a6919e4ebf9ad62c75"

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
