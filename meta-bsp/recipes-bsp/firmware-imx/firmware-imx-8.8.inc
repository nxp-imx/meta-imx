# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ba9d0c13cf51ed451269c4af5f7f0822"
SRC_URI[sha256sum] = "e3c072d0351ddd05fa9ca37f0a5f33dbc6b5aca1d70926eb06002a2c51138f36"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
