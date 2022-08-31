# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "3a8474ddcf1f5ec3a80c1f2e697b304d"
SRC_URI[sha256sum] = "3d54c41057270c27074155eab032b3f48ce880a058fcd5bc7f721a51fc4d9c71"

inherit fsl-eula-unpack

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
