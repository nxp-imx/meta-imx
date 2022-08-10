# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "4f8ea4f5ee68f9a1d9a2f27700684303"
SRC_URI[sha256sum] = "289a021aa6b7ec56fa02e2d21710179dc33cd59c65cce88b7d9119efafea7a65"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
