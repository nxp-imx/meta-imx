# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "b23f86f5a42b84cf54eacecbbd3c9a6a"
SRC_URI[sha256sum] = "280c65f417af664190098980d00c047f047018066bdd64c0d5633fd19e8d2988"

inherit fsl-eula-unpack
