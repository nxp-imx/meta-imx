# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "a2d8e3069c12a54f9842260c4edc666d"
SRC_URI[sha256sum] = "ec9138d7d09fa21211f0bba759a9f382e69f16800f83c8147d3dca7399b7550f"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
