# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9b6769e2246eb8bd2e82e76aff74a3e2"
SRC_URI[sha256sum] = "7185a14d6f841b710bccae860ad64411071ceaa081cf9f8bc66b5fa678bc1d03"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
