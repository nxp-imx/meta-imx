# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "379bbc42fb37e1066f437376272c28ef"
SRC_URI[sha256sum] = "d394d3c83285c321b46ae56d8e15f326a74e23589c4c0440b32c37cba79508bc"

inherit fsl-eula-unpack
