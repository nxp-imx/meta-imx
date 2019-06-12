# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "b790f76844bf252c1e55ae57ed4aef4b"
SRC_URI[sha256sum] = "dcc473634f78d4a7152c0361c25aa623e348138743eb67b68ccb9ad1ec8b2861"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
