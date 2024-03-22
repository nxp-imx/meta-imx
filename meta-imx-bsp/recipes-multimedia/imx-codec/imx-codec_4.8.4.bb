# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "3a951c40b811ba5c3c408b1da847a95e"
SRC_URI[sha256sum] = "9b484d9d742f8b5d9ffd5d5d6e8c1a5e3d735d39636eacda0da86c60b87180d8"

inherit fsl-eula-unpack
