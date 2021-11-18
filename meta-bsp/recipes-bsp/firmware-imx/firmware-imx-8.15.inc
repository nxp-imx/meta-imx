# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "92e655aae9c46029d7d899f36a14e83e"
SRC_URI[sha256sum] = "303e06695d78cb28d66dfd11cbbffba0b8e05662a9045e8d1a9959609b8b3e2c"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
