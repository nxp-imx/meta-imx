# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "79ac2b68b2e1bf137236501a761a19ad"
SRC_URI[sha256sum] = "587148d30c4ed88827a8c0a2b8bf0a6f471c860d8906f8c8fa8cadc6af5698ab"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
