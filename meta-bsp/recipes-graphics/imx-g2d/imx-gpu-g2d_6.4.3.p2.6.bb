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
SRC_URI[aarch64.md5sum] = "88cd43261f5a14b5fc428c0174aefd67"
SRC_URI[aarch64.sha256sum] = "3e51ec5ed6c8444ccbd848fd7d70bf2872310940e5ba3d7d078f3526560fa920"
SRC_URI[arm.md5sum] = "a4019da7c8cc254930c5ee142ed678e9"
SRC_URI[arm.sha256sum] = "3997d55e2489d80809f458c998b9d817b735c974447f5d472aec009d4c10b680"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
