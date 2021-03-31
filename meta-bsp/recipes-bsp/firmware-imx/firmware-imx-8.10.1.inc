# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9381a52d73ea472a100910359bd8ed27"
SRC_URI[sha256sum] = "4069619efcf3ce0f3ad4af970a78cbbb0c45766d7dbe0ae1261017d5503965f1"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
