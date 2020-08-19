# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2a56154a307dd44ff7111775708005f5"
SRC_URI[sha256sum] = "bfe638edf447e2dbe3ac9dec48f46682573f10cbc8c58045f0063f0ed3a0c37b"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
