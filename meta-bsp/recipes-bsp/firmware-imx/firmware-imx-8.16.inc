# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "607f4e4ec3df972325cc5d2173453596"
SRC_URI[sha256sum] = "bf9aa12f4dee5a6fad2170201d3a565ad66277eb9c6791aec699c686c7c43e40"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
