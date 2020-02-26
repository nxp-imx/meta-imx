# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "6841ec85e789dbcf197aeb3bce0d7670"
SRC_URI[sha256sum] = "1c42dc6623a7d37e19ec72673c1aca2b1e30093b6c55f8df2f93b30b558b2dec"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
