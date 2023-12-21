# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "4d629ee2f9323aa26f99d6aa3762dae8"
SRC_URI[sha256sum] = "418dee70f302c3b9c4bb560a5050bea8f8db1c26b8d69930c7d478d7820dd9ac"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
