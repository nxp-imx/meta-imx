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
SRC_URI[aarch64.md5sum] = "06088514502f8e0779b8978655153567"
SRC_URI[aarch64.sha256sum] = "7717781c57682af506e8df256b1e1b65869a5ffccdfc5e90d80bc80199f4e749"
SRC_URI[arm.md5sum] = "b1d80e7f6e239bdbea7f30b742de09f8"
SRC_URI[arm.sha256sum] = "c9aa11d45efce0c2ec6ddccc90a81c2be63b3ebda79eafd36e46f14730f50fc7"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
