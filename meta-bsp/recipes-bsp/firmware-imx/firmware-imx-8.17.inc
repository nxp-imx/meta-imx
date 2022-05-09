# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "084c50c91f99f6b10c47ecaf2b1b92a4"
SRC_URI[sha256sum] = "77523d0d7a7d671e7c405cc99ac653bc627720b80e12b83ef52d595c5a8893eb"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
