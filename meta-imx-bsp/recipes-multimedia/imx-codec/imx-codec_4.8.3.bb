# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "7ae1615aad2c0456b9be2ab804a6267e"
SRC_URI[sha256sum] = "9facb3541903b4a6c6baa906f8c2c6cc01fc8c7b82a726c8da6d3681d4ed720b"

inherit fsl-eula-unpack
