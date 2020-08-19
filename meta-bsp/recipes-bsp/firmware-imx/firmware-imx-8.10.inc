# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "6614ff9dc541d190573d190fd620b7c0"
SRC_URI[sha256sum] = "dad21fb926616d6ffa8ae38cbff1e2d2b579c552c19fe45eb0e346208402f13a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
