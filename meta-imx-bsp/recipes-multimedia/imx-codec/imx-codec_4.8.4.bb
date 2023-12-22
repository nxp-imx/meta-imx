# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "76ee4db26d43db79ca7cc6c719a3c002"
SRC_URI[sha256sum] = "4aa985766c59aabcdac7fd78e64f911138c9859512c938aa27eb2fb4dccf8e75"

inherit fsl-eula-unpack
