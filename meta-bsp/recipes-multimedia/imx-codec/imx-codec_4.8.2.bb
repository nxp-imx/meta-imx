# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "df462e3f5f4a8857d98c949ae4e05459"
SRC_URI[sha256sum] = "3320e91c3634598c419dd5873bbe95af4f5b4641bfa1d9a9b129384f7a57a0f7"

inherit fsl-eula-unpack
