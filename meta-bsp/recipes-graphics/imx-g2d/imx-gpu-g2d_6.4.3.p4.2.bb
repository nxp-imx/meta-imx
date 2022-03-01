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
SRC_URI[aarch64.md5sum] = "a3ddd529476f75b3ba4517d0a313ebea"
SRC_URI[aarch64.sha256sum] = "5a591110be96906bd53c114e5b4b56e087581c5510350682552febea4f25d7b0"
SRC_URI[arm.md5sum] = "770443bf42d4e95643844cd0a040998f"
SRC_URI[arm.sha256sum] = "c8b60920e6b3a08f1686da466861cedc7daab68df9b3ed2b8a0450770481293b"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
