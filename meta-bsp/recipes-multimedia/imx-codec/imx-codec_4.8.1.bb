# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "cb84cad6c7747ac782e2d4b980824d2d"
SRC_URI[sha256sum] = "784a2539b8a5ce5e02f3b9cd1df87f90f53f67b38b8e1db3f7cdec2054a7baf7"

inherit fsl-eula-unpack
