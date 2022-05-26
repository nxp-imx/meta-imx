# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "174da3080bec0d6ae9a9eae72af0c9b7"
SRC_URI[sha256sum] = "b3abc9397b4f99d2547e460c65eeba1f7d3677ee8841881d29aa0897a7708614"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
