# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "af4cadc02d8dc43c3d93f67cc49006ab"
SRC_URI[sha256sum] = "6bb55fae531b23960c992caaaac1ea15229655e27120df2c2995a60c707fa858"

inherit fsl-eula-unpack
