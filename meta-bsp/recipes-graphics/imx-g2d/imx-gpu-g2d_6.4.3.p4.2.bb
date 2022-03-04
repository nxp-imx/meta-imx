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
SRC_URI[aarch64.md5sum] = "b7dfb3296e410eaf4a3a98127965bf52"
SRC_URI[aarch64.sha256sum] = "d29026b1c8581d53194d25e6e9589f84ecfdc2ff04e59e2f5f3cae0dd4631400"
SRC_URI[arm.md5sum] = "91d2ca9e0feb1c8ad2a9f3c2f5ef1b90"
SRC_URI[arm.sha256sum] = "2dfb68f3a9ef337d2038d9df2e3e23ecd61fbffe87b7b238e49ebefb690cdbdc"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
