# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "542584d4d85ed83777dc831a358cdf53"
SRC_URI[sha256sum] = "18c19fdb77a5d073073232f28573f9559e64c71ca1b4b1e39f4a875648803b30"

inherit fsl-eula-unpack

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
