# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "34f6845f5cecc9c20d01d4f9ec9d04c7"
SRC_URI[aarch64.sha256sum] = "b344aa1b301c8af9fdc9ffe43df0d5245fd89c4ae21fd28ab2e3d42c373a6a41"
SRC_URI[arm.md5sum] = "360676e84b488ecaf612a06e0ac3cf5f"
SRC_URI[arm.sha256sum] = "d2690c069e832b5b48593c4c98475ccf5e37d2fe1e0b62c86fc4077c0bca08e7"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
