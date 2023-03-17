# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b14ea8d84fa8afab03c98bc7bc22644e"
SRC_URI[sha256sum] = "4a7418d1ca1b1fa7922e09a8c8fe4e57f45c3c9902aa93e3624cc62857bb0fcd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
