# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2564a5af42f86ecd86ff036813b6c8a0"
SRC_URI[sha256sum] = "3b5dceaa57f80ec7996234371a42bd7676fe19d8daa81aba511eb8fb94c55624"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
