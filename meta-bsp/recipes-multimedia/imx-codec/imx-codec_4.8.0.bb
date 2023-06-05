# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "e33477360b20f1338cf3899c2bd7813e"
SRC_URI[sha256sum] = "ad767de5c50f8d64f9583b52fb42e8b94c5c17f9e75e426b9e4d3053b483b486"

inherit fsl-eula-unpack
