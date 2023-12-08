# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "41d2676148269a95690cd33d80c4f2b2"
SRC_URI[sha256sum] = "4d111de497bcead6c93366e128498cf575e4dd4ab1ba5880c063c8d7949d1fb2"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
