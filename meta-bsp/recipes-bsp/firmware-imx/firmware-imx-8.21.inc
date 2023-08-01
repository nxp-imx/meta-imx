# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2a37715795d64f1302bd2d82c390d606"
SRC_URI[sha256sum] = "4d297962eea0c154d3875f0e56882411ec9402fce1ede394b9160f5e77b8a343"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
