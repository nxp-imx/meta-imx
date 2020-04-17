# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b1de6e7ba1e827c624978d9d91001d6e"
SRC_URI[sha256sum] = "b7f34ec65b3ef1bc953c262a721638202639dc2feceab1e7f46a266ebb8b00b2"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
