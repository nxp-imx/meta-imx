# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "c66e58541171aad22d866a25683db87b"
SRC_URI[sha256sum] = "19d27e1c9399aee0963206a168487a4caa11208de1f146e2b40dad64379e50c0"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
