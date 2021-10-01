# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for i.MX with 2D GPU and no DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02" 

DEPENDS += "libgal-imx"
PROVIDES += "virtual/libg2d"

FSLBIN_NAME     = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "7211057ee93cff0e8a00df4077cee627"
SRC_URI[aarch64.sha256sum] = "dc2ce08b8b263026d4f6fc449c2999935664d8bf88d3881368ec226f54d43a87"
SRC_URI[arm.md5sum] = "9062efa40778b2e050eee0360d63d3f2"
SRC_URI[arm.sha256sum] = "70dfbbd10f667409dac9e2ee9b9cd3b4b5301453b1b71c1b2726d43215ee165d"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

RDEPENDS_${PN} = "libgal-imx"

COMPATIBLE_MACHINE = "(imxgpu2d)"
