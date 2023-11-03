# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "9aaa45f10232be78b8dc56dcff7680bd"
SRC_URI[sha256sum] = "41b04d6552c5472406dc0ec27b31f4be6df66e456395879843aa1543ca28a412"

inherit fsl-eula-unpack
