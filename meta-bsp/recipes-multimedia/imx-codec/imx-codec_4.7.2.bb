# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "6b17dbcd2f37e946c8e4afe5a3ee70ee"
SRC_URI[sha256sum] = "600bf84bc95705775a420c28db47bc52f84528c1657192775be62ddcafe13fab"

inherit fsl-eula-unpack

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
