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
SRC_URI[arm.md5sum] = "63f673e96a58f0220eae8d17975ace11"
SRC_URI[arm.sha256sum] = "2783f3e49b63ccbc4a1d50a9314f9d41b3322f880d8a98ffb874ac17105311af"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
