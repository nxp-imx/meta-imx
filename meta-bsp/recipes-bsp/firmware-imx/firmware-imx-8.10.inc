# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b8b9ee1e55ea6d50a8920fa678a75542"
SRC_URI[sha256sum] = "30f13c482195440a5555f83c95494a3a6e871ec0a2edf7d4e1b14b19812533e7"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
