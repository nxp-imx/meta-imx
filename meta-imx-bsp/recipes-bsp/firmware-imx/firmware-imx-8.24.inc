# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "0ed601f15be92c12bf5644d93e3ee4f3"
SRC_URI[sha256sum] = "28490ce6c36132c6ae2fe5a4a8dfa569b976684032164dd6426cbb437d5814d7"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
