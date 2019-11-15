# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "66fd71b68a4dd7cd3d2f31087c9737a7"
SRC_URI[sha256sum] = "2fbe4e20b706457db1863be7e4574ab4ade1efe894dbf5141d850ecd4756adfc"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
