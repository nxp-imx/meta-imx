# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "db2141d7778d09dc83f91464a91ebcc7"
SRC_URI[sha256sum] = "97291e205b06668bfad8a49b8ad448f0ea92dd47f0d2125a246b2efd05661f21"

inherit fsl-eula-unpack
