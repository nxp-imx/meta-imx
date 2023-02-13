# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "59c0ffe8c5a6642b2dcf4a6fc94a4e7a"
SRC_URI[sha256sum] = "e0741c2d58c397a072ef5b1f9a72fb43a487a8d2eafab3b9ba9a48cded16fc89"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
