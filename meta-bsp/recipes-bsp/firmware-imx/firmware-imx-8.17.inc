# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "f2731991eb48d151f33e43bbcdd0921a"
SRC_URI[sha256sum] = "3f38d73a505aeaae894b46b1c080e96b721bee2f6de3d638a2412df6c9435166"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
