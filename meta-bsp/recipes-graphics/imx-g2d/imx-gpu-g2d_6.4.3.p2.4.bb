# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "153c511955f5d8e2e70394aaf038e249"
SRC_URI[aarch64.sha256sum] = "8b67cbc8c9579224d1c2f05d8c5b94ad8c94bc63ccf03db1db837024d8c24935"
SRC_URI[arm.md5sum] = "c3f1f86e0dc49f15eca787090e718ed1"
SRC_URI[arm.sha256sum] = "71e4b43ba5ddbfa243f7e0ba28e15e6a7945afaa908be5c5ce5ac51adc0e3446"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
