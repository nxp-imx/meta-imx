# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "e6b23fe8f74e6641f571ef99f2df5561"
SRC_URI[aarch64.sha256sum] = "e024fcc5f00d66b2efc8c87fe77a993c7f6f07872e2c378b6f16af2b44fe035a"
SRC_URI[arm.md5sum] = "7ce144724288e7ca9dc474f9fd5bc6b6"
SRC_URI[arm.sha256sum] = "4f8e7e2bf74a08378f4d57aed5d1d33a523d5194838dbc2cb3e84b6f2527ff2c"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
