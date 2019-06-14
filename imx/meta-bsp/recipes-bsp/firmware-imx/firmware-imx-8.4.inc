# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2d6a17cd83056fc15105b43cfc4f03e9"
SRC_URI[sha256sum] = "ce1ad8f150f7af26b7c6a25a8bb0c933bd3302f6f20e9921046c94fef876d3c6"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
