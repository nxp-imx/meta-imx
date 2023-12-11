# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "c1e7dfdc3caa972b70418f9c5bf1c0f2"
SRC_URI[sha256sum] = "21c7ddaae4d1bab331f1697072c24a8c10f1354ba58658931dfb979e5cbe1dc1"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
