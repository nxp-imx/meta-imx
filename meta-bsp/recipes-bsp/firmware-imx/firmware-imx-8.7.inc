# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "deb1f536e76bc8738073f3b035ee0973"
SRC_URI[sha256sum] = "2b87e93a0dc1b2c08aad4148e50edd78cabfbde4ecb4f6d94706d9388c0935fa"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
