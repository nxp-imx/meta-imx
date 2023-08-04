# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "726d4801655245bc8e2bf0daa860ef7a"
SRC_URI[sha256sum] = "d2808514eff8fac51fa8bb65f89742d7e2829c8b54a87361e13661ae0d1f8f09"

inherit fsl-eula-unpack
