# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "a47f6407459ab4889e1bd9651b9dd40b"
SRC_URI[sha256sum] = "0d0668dadbd69c40c1d0e29cbf4082df008a7cb7ec7e5cfe7d8f228395bdaf58"

inherit fsl-eula-unpack
