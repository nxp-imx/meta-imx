# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ab1ee6c747718fae7b87c1ee6bd04bea"
SRC_URI[sha256sum] = "5e4bd8e05d2f131704a11c2bfc58d3fc1032d858ad06e53e53090635187f4acf"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
