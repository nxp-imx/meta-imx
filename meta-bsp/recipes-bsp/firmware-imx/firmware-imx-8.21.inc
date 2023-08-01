# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "48b9e116280d752f1696dc36b08b07da"
SRC_URI[sha256sum] = "c3447f0f813415ccea9dc2ef12080cb3ac8bbc0c67392a74fc7d59205eb5a672"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
