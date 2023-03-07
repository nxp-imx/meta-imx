# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "1c0740320bac20aaa741a1d2f4eb0054"
SRC_URI[sha256sum] = "b0121231c66e325973c1298886b823228e955346f3c8a815abe4321e8b0be5a8"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
