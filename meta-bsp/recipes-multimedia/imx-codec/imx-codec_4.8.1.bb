# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "6a0cbf28f8d852e9b3b575e58933454e"
SRC_URI[sha256sum] = "45604edfc7b105bc1f003ceb088b2898c094beb668f2eae514415996e1fc0a3e"

inherit fsl-eula-unpack
