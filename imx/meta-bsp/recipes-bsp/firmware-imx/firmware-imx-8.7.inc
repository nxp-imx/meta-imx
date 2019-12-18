# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "11eeff2a3d0454da427e0ab16c2627cf"
SRC_URI[sha256sum] = "184c3ac5563976c68e52cf8cbf42272ab05ac23c225fb865c42a3b73ad6d1bf2"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
