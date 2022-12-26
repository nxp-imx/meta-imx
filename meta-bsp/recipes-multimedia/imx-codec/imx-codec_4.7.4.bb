# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "cb4ce793ee896fb71bf0e9206b4daab6"
SRC_URI[sha256sum] = "0a4d2d8747b2dbedbc980bbef067dc8b0aeb257deea08d2c9cc9e9f54d0a4157"

inherit fsl-eula-unpack
