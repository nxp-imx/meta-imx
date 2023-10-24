# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "81a2e3baf856fb70e1482d656ea1d0a7"
SRC_URI[sha256sum] = "1f5291486db83e80864104af9f1071cea699395cf78f3d2f64caa00e79d3f6df"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
