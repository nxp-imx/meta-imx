# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "139ed225752f53c146c76763327f7f3c"
SRC_URI[sha256sum] = "f1104787164ed10436cd4041bc481d33466748e8af99bd76e807ae861a86d294"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
