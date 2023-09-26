# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "80e2439dbd0b982bdf7dcce7131ad7a3"
SRC_URI[sha256sum] = "004e75fcb28fdb1b0fb4ceddf916b5276061bd44c6f05accd190a9e6c633fac8"

inherit fsl-eula-unpack
