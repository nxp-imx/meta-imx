# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "b25dcc269af0136a69db1e0e40115ee0"
SRC_URI[sha256sum] = "7a680709b5051700adc79079bbd579785dfe4d13e53de45d4a7f7e1a468f62b0"

inherit fsl-eula-unpack
