# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ba21667f98891f0c4ae0d3a068760b58"
SRC_URI[sha256sum] = "40db1824c79a817830f7a7079ebc5b4dbb01271bb75bbdd6e5b0ad0359493750"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
