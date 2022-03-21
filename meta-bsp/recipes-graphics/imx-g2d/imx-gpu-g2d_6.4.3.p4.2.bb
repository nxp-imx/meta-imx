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
SRC_URI[aarch64.md5sum] = "ee5e4813f73ca004a247dd5d7d5d38cd"
SRC_URI[aarch64.sha256sum] = "1dfb0a9872004a8faab0b4d7ec1c5cfd4081b7d68abe51ab26634c3b4302f778"
SRC_URI[arm.md5sum] = "56313bf2622c6fd906ed6e1c3c08838f"
SRC_URI[arm.sha256sum] = "11e584141f7e320cbf6534b44d4cd6d65a752c2f144cc0b315bf0ae0a575aab0"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
