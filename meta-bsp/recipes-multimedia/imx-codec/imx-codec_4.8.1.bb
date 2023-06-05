# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "40710c7b158505fe9d7ab7f85fc4ba3e"
SRC_URI[sha256sum] = "aec45487d826fbe661fc21aaa7f8925c60773cb51e962757c2928ebd50c58244"

inherit fsl-eula-unpack
