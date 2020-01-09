# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "e574c83cc68f4f8e41092674e8117a55"
SRC_URI[sha256sum] = "272361a12495f428d14a8e94beedb3236ab38a25e9ddc4fc1dfe9614477061e7"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
