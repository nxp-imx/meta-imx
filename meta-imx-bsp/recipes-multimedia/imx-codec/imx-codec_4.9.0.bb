# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "57e6c203c6eef18ccb8b56bf6028b314"
SRC_URI[sha256sum] = "bdb4ee343ae8a9c1be6ab9d664738dc884cf1f6a8c3b00c007dccfe612f10888"

inherit fsl-eula-unpack
