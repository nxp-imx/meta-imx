# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8d6c31a97cc12a7bec43124a55b3322e"
SRC_URI[sha256sum] = "bd7afe31a831a5a4572e4388502e67feda9da5ab3c792bf1378f813b1e31891a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
