# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "fc7e37360901de1a11f7e7f00475663d"
SRC_URI[sha256sum] = "e43a9013fe1a24de737ff2a6c68f2ef8f2f8da3f1b59c73d5d0ae4916b27a28d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
