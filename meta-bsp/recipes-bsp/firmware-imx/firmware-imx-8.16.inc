# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "0e4cfa44c27ffe597a2f12726cf57dc7"
SRC_URI[sha256sum] = "dde7dbe91aea4b2614012d6b61154e5e968492da197d737b38415aefca01cc0a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
