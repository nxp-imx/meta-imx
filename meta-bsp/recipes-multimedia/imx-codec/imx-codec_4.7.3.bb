# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "0f304ea9ac25a8f0231474b0cc4de744"
SRC_URI[sha256sum] = "d68bafb67a481a08bb81dfbc50e111411f5f2414be26f6406ffb896366a096bb"

inherit fsl-eula-unpack
