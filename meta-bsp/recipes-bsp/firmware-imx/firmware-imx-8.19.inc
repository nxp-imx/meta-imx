# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9092d285ad539c5c08b3535e87dc030f"
SRC_URI[sha256sum] = "53b963127526721fa7936742ff66c73d4a17049a7ea8d15eebd82a9356f15dd9"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
