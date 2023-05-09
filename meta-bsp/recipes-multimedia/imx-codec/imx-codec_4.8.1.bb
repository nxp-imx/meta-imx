# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "29731509c6d6b0f1b64d8e7347a76827"
SRC_URI[sha256sum] = "e0b36e7f9cc0ee4d6e79c6e571d46ba1af6d78f41f8ce9240db19674f742da68"

inherit fsl-eula-unpack
