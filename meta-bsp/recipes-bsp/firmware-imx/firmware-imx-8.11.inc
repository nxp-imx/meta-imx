# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "11be2e3b45391f2d8ab63bc028f3a11b"
SRC_URI[sha256sum] = "a7f362ca8080f8da3d8ad6a66026f565f53e991435cc21f4ea1331de57bdcc2b"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
