# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "126fc0bc8d6fb4b4a1d02c09ebac264a"
SRC_URI[sha256sum] = "9b58f7dde2301ed0f4ea46c8eabbbc602b3c5abd1ba6398cd07415644acf359d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
