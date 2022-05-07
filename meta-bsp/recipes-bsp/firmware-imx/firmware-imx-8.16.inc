# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b4c47d5c013fa5408915d6891a502735"
SRC_URI[sha256sum] = "50fc3946b58d19ed103d87875645ff5fd858e4d3c006830fa8665d9f57a5719a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
