# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "2cadf5d1924ece04c41bc296cabe5b9f"
SRC_URI[sha256sum] = "043d9ebc97489610d8c3908bfc16b5d0b4070b179de59edb7f0aa8e3f9a7fbb6"

inherit fsl-eula-unpack
