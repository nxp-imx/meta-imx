# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "0067a9807102222301a2f71076acdb21"
SRC_URI[sha256sum] = "b7c1939db2304b6f4567d2333063fa7dc689a88c3463e43e7b3d039055db3322"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
