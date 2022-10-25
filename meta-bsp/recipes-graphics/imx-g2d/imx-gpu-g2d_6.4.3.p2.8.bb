# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "a7d66a7d0847f9e92184e1430f6ab958"
SRC_URI[aarch64.sha256sum] = "a8877fa0d41c852fd84f39bcf1932ab34de988c24ce8044bca0823377fe3f7dc"
SRC_URI[arm.md5sum] = "fd7b1381b83e1177773ffe03a5e65858"
SRC_URI[arm.sha256sum] = "08a9aa39b5951eac94e6a55ad7072a728c51d4fa264e86630df5203f1e428794"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
