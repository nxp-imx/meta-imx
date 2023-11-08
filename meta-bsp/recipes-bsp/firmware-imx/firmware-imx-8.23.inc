# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "d6842b224bd0484cad1535d67b47daab"
SRC_URI[sha256sum] = "b103430184a71e3f7c7ff63cb959d6d4f9ce2d3c0fe982b8af3c5c24d5bfce16"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
