# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "82fa58c20a279b115c806c5c554caf28"
SRC_URI[sha256sum] = "b2ad20c61ddb69ef9a41e3036b2f5439f977cd0f9804bb01fd3d396420182c43"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
