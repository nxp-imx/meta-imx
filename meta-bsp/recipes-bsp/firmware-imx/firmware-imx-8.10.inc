# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "25f2bd1cb8c57774c96509eaf97e3111"
SRC_URI[sha256sum] = "123105ee98eb7998a92acb04f5965a874b543458cdaeef17656a1a66e337fab0"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
