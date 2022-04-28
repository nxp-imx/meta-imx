# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2e62e9642b88299b4f9164da14ddaf4f"
SRC_URI[sha256sum] = "6be6f5a6d14d444d5749132fd2ef3b28f8f86279c99fc4041027314f4a52e46e"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
