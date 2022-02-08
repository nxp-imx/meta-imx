# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "7ba3944e5a9e8097dfd0a3469a0216b1"
SRC_URI[aarch64.sha256sum] = "e2b81d7e2a2a1d5a1a9d9b2d5cb7581892fc624d1bfeb01d39f050bdd5cfc210"
SRC_URI[arm.md5sum] = "9d4def42e61df0ad0d82a2ffe0731600"
SRC_URI[arm.sha256sum] = "b45955149a74a4c1f5c40079a60f0408d58ec7d29975ccb45a41de64c32887df"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
