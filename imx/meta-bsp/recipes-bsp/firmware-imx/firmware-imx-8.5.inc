# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "6fd8806f9951ee830ebdf23f135cf3e9"
SRC_URI[sha256sum] = "c2c55416e9e7ded3d67060e7292bcebb997a555bb017357094d23aca4c3a7fc7"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
