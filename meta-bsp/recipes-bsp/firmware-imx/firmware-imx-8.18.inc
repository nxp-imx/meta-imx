# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "f30d1d60fed5d0add3a04da6b76c6b3c"
SRC_URI[sha256sum] = "d20dc5f471b6c488801e3468269cfe9fcaf085e0e3feb1c315f116a9de42fc9b"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
