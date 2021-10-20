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
SRC_URI[aarch64.md5sum] = "9dab339cba31caba8af5cdc044157392"
SRC_URI[aarch64.sha256sum] = "559cb3b2044f5324caf8c09465357538419390b0d7667114b2106252657a9696"
SRC_URI[arm.md5sum] = "aa47e234aeda4c4fa793965d28f013d7"
SRC_URI[arm.sha256sum] = "bb7889ff44923e4b4e75c57359e068beb928739ddb0c9af45d6ac56917da2fc0"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
