# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "96f9d69ec761a7b92afd3a90c27c5c66"
SRC_URI[sha256sum] = "8edbb9732d9f261f851a86d7ad10069a2cc8dd33673cb24cad2d74234311fe31"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
