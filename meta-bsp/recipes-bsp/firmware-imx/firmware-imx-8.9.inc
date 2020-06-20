# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b38e077ee7c6fd71cbf889d1ed6ff787"
SRC_URI[sha256sum] = "814bc398f5b83035ea9b9e08df1bbbb5d413f7e6ca8a2f2520a85915e67a1d13"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
