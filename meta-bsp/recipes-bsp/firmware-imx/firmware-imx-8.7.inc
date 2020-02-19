# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "6e72d3d6e842378cde5e9461843d3fce"
SRC_URI[sha256sum] = "76dbc03bf2fd6cbbee10b8572ff1f61ad5caa3b63c87c66ca350e70ccae62e00"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
