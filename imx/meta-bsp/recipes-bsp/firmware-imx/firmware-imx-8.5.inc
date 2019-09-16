# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "d010f05ebe460036c659d7404242e4bd"
SRC_URI[sha256sum] = "c06bc79f763335b93c928d6dbec8cdd559a72908d4f8b9b32f670f198f3741a9"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
