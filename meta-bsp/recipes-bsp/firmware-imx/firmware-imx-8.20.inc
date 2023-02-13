# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "7ed8de94fb8ef56bf39bc1ced17effa5"
SRC_URI[sha256sum] = "d8db3b0ea2d599ba16fe8951a61d47e015fefcb2595c8bcc78259069e08a312d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
