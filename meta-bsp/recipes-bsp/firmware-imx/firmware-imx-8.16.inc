# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "84a9a63162bb7da3126174ee83739b6a"
SRC_URI[sha256sum] = "9c82b62e51d241a87b6260437747e538a740b6e8edc8364ecf8964ef27a498fa"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
