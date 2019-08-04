# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "22a6a2e3753f37d69d116734d5b4ebe3"
SRC_URI[sha256sum] = "a641c0a8f2cce9931944a39c336dbf3163fd6f6216559f20e3e7ae3b605009e3"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
