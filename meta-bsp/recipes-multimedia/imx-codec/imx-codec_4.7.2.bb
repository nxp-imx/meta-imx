# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "e5ddb828a3a760089bf4da2cf9166f23"
SRC_URI[sha256sum] = "ca7abbca4db1a130900b46578f4be4194a87d1a60d37e94b757b91439e8361bf"

inherit fsl-eula-unpack
