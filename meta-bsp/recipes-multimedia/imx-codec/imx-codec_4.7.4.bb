# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "ce74476b76c2ae61a437150945f128ea"
SRC_URI[sha256sum] = "863968327e005dde2be5c2d1f9a90d395769d337aaf6fd2f04ab7bbd4256823b"

inherit fsl-eula-unpack
