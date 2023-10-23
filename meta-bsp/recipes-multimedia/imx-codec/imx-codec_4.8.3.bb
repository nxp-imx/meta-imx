# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "c17ddedf6dda2e3f503f0fc12f2c3259"
SRC_URI[sha256sum] = "acf1fc4d1dc269b115221ce0f21dc9fd8a8e53f3242b874ca6121101acd17796"

inherit fsl-eula-unpack
