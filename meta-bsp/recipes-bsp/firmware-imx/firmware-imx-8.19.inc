# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "6bc3e03addd804b0ab3112f57e047c60"
SRC_URI[sha256sum] = "c4ed3c7248012be9dcf98ef0acb94fdca94ada3bb47bf154f544ec8019233b0b"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
