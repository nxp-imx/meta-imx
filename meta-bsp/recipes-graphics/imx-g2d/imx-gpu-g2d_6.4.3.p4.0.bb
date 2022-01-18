# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "cb52f145490b511c1dffa23d372a4ffb"
SRC_URI[aarch64.sha256sum] = "e7bd4e4143d07795418395751dc7c3098d9035249cdf4cb740c206d10a049b3d"
SRC_URI[arm.md5sum] = "8ef426b87aff8f285193574f9340c7f0"
SRC_URI[arm.sha256sum] = "8ec0f96c5f5bdac09ef837de7d98db938de5fa7eb36970625215401888546ba1"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
