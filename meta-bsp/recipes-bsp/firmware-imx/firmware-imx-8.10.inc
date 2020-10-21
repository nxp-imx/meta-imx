# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b4d2d9c0519e8afca8d1a515d4f7195d"
SRC_URI[sha256sum] = "e5d338e18498edf72d2050d79ab6db4ed069e77decbb52c2fd6b52c54a85f7bc"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
