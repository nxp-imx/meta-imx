# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "4e40f48a18ed596f59e5163d3271b2a8"
SRC_URI[sha256sum] = "5dc1a39980e5ee98be419a95bcfeb2c3835fff800d8d669cbf28a1d29550b074"

inherit fsl-eula-unpack
