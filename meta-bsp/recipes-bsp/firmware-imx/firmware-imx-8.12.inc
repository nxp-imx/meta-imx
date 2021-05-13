# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "a869067cbfc7b1b002f6f3f86d05a1aa"
SRC_URI[sha256sum] = "3c5bbc46ace93cebe57fa714951be13e06efe1a6e277fef67ea149eae88ac306"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
