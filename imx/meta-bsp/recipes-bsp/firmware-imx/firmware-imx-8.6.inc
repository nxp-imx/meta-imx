# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "87a814d4565d3deeac909983cfdde50b"
SRC_URI[sha256sum] = "692917b3feb53c8b02e6476fe8faee048adb860383d1b85efd955e979bcee12d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
