# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "c2757f1d2455623bc05587ec62421f2c"
SRC_URI[sha256sum] = "fc81af3ac2fd6726b2b921b8431f9553c0098534e1f671316dcbe5f9bdade6b8"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
