# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "cb89cdda99e350d372e3a9b411c77143"
SRC_URI[sha256sum] = "62772b0e7dd7cab5a1cc7ac6ae4ab01824db72199b2559a47a0a39bdd0fd1d02"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
