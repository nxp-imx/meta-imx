# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "79887b33fff1fb85fc29abe36bf649b7"
SRC_URI[sha256sum] = "73ac1b2a1a5916a9ea0719b695bb519b0887046553423cc03f05970633c09687"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
