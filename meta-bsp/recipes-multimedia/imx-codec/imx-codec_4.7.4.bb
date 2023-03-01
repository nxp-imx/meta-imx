# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "dd730ca09d6c64c7f05b6817a22c4ef7"
SRC_URI[sha256sum] = "64237716dc465283239ff57b9523712948ba25b842652405ff66c1ed7f5c86fb"

inherit fsl-eula-unpack
