# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "ebeba04943d73ecdc1e83101829ac106"
SRC_URI[sha256sum] = "93bde8575d06a2d9b4a78e4c2dd52527409f04b7b6d275d44276b5a2de99a5be"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
