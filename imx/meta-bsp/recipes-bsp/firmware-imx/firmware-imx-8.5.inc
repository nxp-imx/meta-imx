# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "361a8658771edbec348ba0502396fb2b"
SRC_URI[sha256sum] = "6221f082f4b36c5d66a148e121548bbc1a5f122f313a62f73bcee1c5f12e8543"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
