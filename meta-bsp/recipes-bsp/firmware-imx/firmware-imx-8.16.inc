# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "554b24aceb43bbd0d26e3d6785502b98"
SRC_URI[sha256sum] = "d0f7b9b9a567cb393c27955602d06ea1a632a0f9085e9ced596d5cdd3565a459"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
