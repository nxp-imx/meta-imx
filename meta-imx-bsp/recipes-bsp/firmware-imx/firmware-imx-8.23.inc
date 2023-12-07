# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9de6ea14909ab89c50516ce91df8dd9c"
SRC_URI[sha256sum] = "639d885462c1ef1432a307c0c5203c76f28a8a95bb6741266717978a0fe597c8"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
