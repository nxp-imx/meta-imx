# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "608178c174707d6a605215ff8decadd9"
SRC_URI[sha256sum] = "aab3e1061f77258d7d5bf14b6a63b9b90887a5a2e9bdf89470bec2d4dfb3181e"

inherit fsl-eula-unpack
