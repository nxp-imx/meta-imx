# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "e78bae0afd168e037785995d00f7455d"
SRC_URI[sha256sum] = "2ebe3b5b8d0e83160a20a4850302445fd959c835c3335ca059e23f09bcf293b6"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
