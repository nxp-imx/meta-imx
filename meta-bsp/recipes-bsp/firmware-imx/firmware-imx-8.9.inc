# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8391e4244ac0b435499e3738ce607791"
SRC_URI[sha256sum] = "b29562420dbb0b9a549fd3ebd0f184744cd0574a366032cc201ddadb9dab2497"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
