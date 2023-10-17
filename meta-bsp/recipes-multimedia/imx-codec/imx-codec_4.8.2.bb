# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "1977bab8d89972f08d9eee0122a64603"
SRC_URI[sha256sum] = "b0744a91c265202a79a019c72f17cae01fd5b63a3ba451592b6c8349d95719e0"

inherit fsl-eula-unpack
