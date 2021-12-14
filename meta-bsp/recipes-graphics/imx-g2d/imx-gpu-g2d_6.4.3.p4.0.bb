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
SRC_URI[aarch64.md5sum] = "af18b2cd6a43d7eff9cb13ea37a9da07"
SRC_URI[aarch64.sha256sum] = "931acdcc8320c8841c1e2c86ca502793010874c5b4b88542691730f4c86325f7"
SRC_URI[arm.md5sum] = "b799acb004579f09e4ca75acf7ba19e7"
SRC_URI[arm.sha256sum] = "dc93b13a6aad70b9c0dd6ee160f171cc5b38f191008dd5255dba17decd272516"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
