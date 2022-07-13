# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "a937f4353d18e6ac6cfa99baec763646"
SRC_URI[sha256sum] = "49ba6dd52e149c0332dd7bebaae4920490545245995724eb06006edcdcd519e9"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
