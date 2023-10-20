# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ab861512d634482bd1b7abcf56b94dbe"
SRC_URI[sha256sum] = "9c1d23e4d046d5f8fd1b13001ed824f83b83d81fb3fe665228acd223a9ad224e"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
