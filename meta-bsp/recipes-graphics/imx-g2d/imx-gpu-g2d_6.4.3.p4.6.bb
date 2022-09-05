# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "49282872111d14aa28f49d4b7661d833"
SRC_URI[aarch64.sha256sum] = "ea4ab8e56c5bd922b5ed30ea8ab7af81998ad5c4f9a1476a2a565bb141df5ace"
SRC_URI[arm.md5sum] = "933af4dcebdb0036899dbef4c5a3acfb"
SRC_URI[arm.sha256sum] = "f7f247fc580ea83b2cbbc0382c7b49f34778103bff9a44a6df5f4f3956656db2"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -r ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
}

INSANE_SKIP:${PN} = "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
