# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "482f07d354d8d2b884416476452d4f9e"
SRC_URI[sha256sum] = "170a2f9777306bdb562c504f89e11efff54a208ee2264b8f5b7d60459ced5054"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
