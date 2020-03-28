# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "85020853fd4bda3d37709b286788ed7c"
SRC_URI[sha256sum] = "de6f2e9f0926982f4f393fb6b3ad538484f8e009b8eb0cfe420e755fd34f78cd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
