# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "366db26173951ca231e2c495e7040163"
SRC_URI[sha256sum] = "b76409bdf43f594f7c66cc06e11cabe2858907fa579917fbbb32984a17424e09"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
