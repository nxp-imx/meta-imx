# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "a85d360ca5a1d41aa84319e9482392a2"
SRC_URI[sha256sum] = "e871d8f7360bf2e97ad6734420eb6b1242f41a77a060589562bb25d3fce0c8dd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
