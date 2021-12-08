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
SRC_URI[aarch64.md5sum] = "3668d513e0ebc678fa010859431c5840"
SRC_URI[aarch64.sha256sum] = "2f891cea11a586593a7f6d4923ad37ce93dd212d97a18f7d6ee4b618e4c44a0d"
SRC_URI[arm.md5sum] = "33f806162905f051646b648af21a596e"
SRC_URI[arm.sha256sum] = "5a845aa66c0a72ed997ce727bce4f80c0fc6a66b76102c2146f3cc61135e7cce"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
