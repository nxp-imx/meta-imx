# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "d29b9dd3f7cfb10ce96798452ab416d2"
SRC_URI[sha256sum] = "3850cb9806614873a874ecf33ece2ac765e86465b4b54e5065150edcf72523f4"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
