# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "a1c487fe9a627e0e02d02fb0f423499d"
SRC_URI[sha256sum] = "254a5d90436f66a706b3f5ecfeb3ef150e5c374885eabf8674bd34737e22908b"

inherit fsl-eula-unpack
