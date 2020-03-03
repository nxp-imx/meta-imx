# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ee442e4d975578736f3f72593906f41c"
SRC_URI[sha256sum] = "92c1713f61a99b1ff5046a795789e6021db1e8bb5534c02e4b719f1436e15615"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
