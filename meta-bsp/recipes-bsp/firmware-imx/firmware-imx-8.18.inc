# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "5812d0459cd57a017c27217db533c589"
SRC_URI[sha256sum] = "7c82d3665ec4e4fea017c2dd183c65c3e2be0b6dce54d02c5431cbf497682d03"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
