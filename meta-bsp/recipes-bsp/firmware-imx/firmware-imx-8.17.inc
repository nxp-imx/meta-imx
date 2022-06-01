# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2e42e7a47d3c046fbc0ff0495c91fdf2"
SRC_URI[sha256sum] = "676964d0a3ac86373acdebbe4a622b10f094dc539448da06ae5ba21cd3e6689d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
