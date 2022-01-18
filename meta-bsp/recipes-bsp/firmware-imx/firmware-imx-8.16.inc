# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8f732518fa3f288f3115729dc44ee8c5"
SRC_URI[sha256sum] = "9ee65e3c32aa4fe463d4217194db70f919038d7e9d4950999b5b25a5e86846a8"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
