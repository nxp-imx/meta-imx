# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9fa5d7d86a2f62663abd2197af36b7e9"
SRC_URI[sha256sum] = "9a625a0cbd82fae65c67eb248f6f5b89b85b913f8659a839e337ed6ae4fbb73b"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
