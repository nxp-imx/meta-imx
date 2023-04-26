# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "91105b13970a1d01f3fc6b8ab5240324"
SRC_URI[sha256sum] = "68b87d9e41036ff790551f922fa5a5e03e5d0a7502fceaeef6ecd4bccb1ae9ab"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
