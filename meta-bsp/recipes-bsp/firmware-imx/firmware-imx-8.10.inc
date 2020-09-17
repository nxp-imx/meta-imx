# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "04c4a613289c2f213b5cae07fe7aadea"
SRC_URI[sha256sum] = "3283404576bfb77ad132d8f44048bfc23afe15920356172ed5d85c44a9607bdc"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
