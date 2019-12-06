# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "f634ecd90527b02ce8b88f63bf4f1928"
SRC_URI[sha256sum] = "d8e4b35f135819d24d46d419212e86b3c64014905dc265220144fbc08424a2bd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
