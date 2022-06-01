# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ba7ea200f5c9c877781c657477b163c7"
SRC_URI[sha256sum] = "b2925c4221147e4666136577eee545ace6cc159a59d8123ee2da68b36ae5280e"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
