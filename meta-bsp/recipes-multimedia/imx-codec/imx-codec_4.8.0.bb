# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "7f94e54bc78bf0f4626808fa3bf5c23e"
SRC_URI[sha256sum] = "2594a7e196899f634be0e090332f5ce073ae9796819b9a7601191ec752b921cc"

inherit fsl-eula-unpack
