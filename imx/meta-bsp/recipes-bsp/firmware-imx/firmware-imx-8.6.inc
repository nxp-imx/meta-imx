# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "54b6123364693d45ae20cbc1174c9d5f"
SRC_URI[sha256sum] = "2b6db4ec8124f6eb1d3849ad7d6d535c7bc38efc493feb99827ffb3cb55acfa0"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
