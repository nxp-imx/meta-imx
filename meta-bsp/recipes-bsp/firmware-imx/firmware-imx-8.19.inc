# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "3afe7ee8f8437041e76691828de8a2c6"
SRC_URI[sha256sum] = "022186742b9da1e5a7ef49f57aa63942c4d72a8ba18e99108a01f063a0d8ef04"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
