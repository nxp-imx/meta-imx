# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "4bd8b69704a3ec2c84facbf6d24507b3"
SRC_URI[sha256sum] = "b7aeaaebce002173ea23f528448e44e8c998adbc2523d873c7cb786d1aaed33b"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
