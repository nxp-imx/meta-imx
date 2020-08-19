# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "5ccf75d764a5b2dd34cc7c9e3c36384c"
SRC_URI[sha256sum] = "e8db55dee8c097ddd22ea70abef06be416af46172870bf8f45d39e04a79f5a32"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
