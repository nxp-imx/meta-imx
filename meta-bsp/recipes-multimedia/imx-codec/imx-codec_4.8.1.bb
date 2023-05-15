# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "6b937bd56c54cf25bff0a45dd0468643"
SRC_URI[sha256sum] = "d12e1f5ce7eb6a572d892627b96f8818f694286777657c161258f5c7c31d0321"

inherit fsl-eula-unpack
