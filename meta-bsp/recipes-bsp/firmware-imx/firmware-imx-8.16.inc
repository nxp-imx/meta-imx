# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "4619c6c1639f4151ab751e80aed977cd"
SRC_URI[sha256sum] = "e4f83311e751dfe24a07e24dfd8c138dc79aa1cafa09096cd3f35a2b00638d7a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
