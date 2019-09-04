# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "6f97d5a56ccfa4d349d876dc1013797c"
SRC_URI[sha256sum] = "03f176f18d520e27f662c06623c6e5639e85cc3553a6ceb16d067019f704a861"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
