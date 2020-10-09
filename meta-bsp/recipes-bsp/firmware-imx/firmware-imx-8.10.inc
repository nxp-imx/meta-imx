# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "10bc26268a0e9936c2b18376fd9dd309"
SRC_URI[sha256sum] = "3d908f249bb1642791aae8136456048149346da64aacf215571f0a13e6a6c190"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
