# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "8b93deed6a4746ed38d52637a59fce1e"
SRC_URI[sha256sum] = "93ddd6ed57b1b9d64bc1ad6fe02fa4b7ed46855e7a9fb66d329ef935561cd632"

inherit fsl-eula-unpack
