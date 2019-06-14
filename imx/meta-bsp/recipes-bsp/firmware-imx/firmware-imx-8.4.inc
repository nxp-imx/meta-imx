# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "50ffa61dad978e3f79b9b489679010eb"
SRC_URI[sha256sum] = "9b9caee22ae35520bbc731876c9cbc58a5c019c4713879a5e3f876ba0c9afa64"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
