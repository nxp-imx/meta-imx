# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "57f5e1aa40ce472492f3e33d14f3ad30"
SRC_URI[sha256sum] = "fa5d12f7fbe0b89b14b89115d3221159ce5c293dcea1f20eab0073d61b5917fc"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
