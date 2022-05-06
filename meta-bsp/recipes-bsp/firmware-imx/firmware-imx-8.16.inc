# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "dc715c2d8e3acf2c19a3f271308b044a"
SRC_URI[sha256sum] = "b2e16576462658b7e5f6cf4e1d18b300486a2b6ab27d86ff469cc06ba4caa8aa"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
