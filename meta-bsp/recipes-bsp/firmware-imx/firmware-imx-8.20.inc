# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "e6127447176adc9a50cd63725a40be7d"
SRC_URI[sha256sum] = "ff1b3d79cfa1f79590a8040707d077dceded7290097a618655537e6eb78c13fd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
