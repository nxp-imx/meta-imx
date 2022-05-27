# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ef10e35848e66ce07a7426d737e09cb8"
SRC_URI[sha256sum] = "91a6ced9c763a3f9ad93d27d60cc3a1054fa718050bf3f58c9603c45c15d1093"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
