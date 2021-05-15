# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "59e3640e4cf98fe659def6d1a295e464"
SRC_URI[sha256sum] = "7b66e436ccf1dcb0b64874e39ef830e3e7168414cfcbeb2ee980914dddb0ec6f"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
