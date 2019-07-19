# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "544ed4e446157eb0315242f98d9d3b9f"
SRC_URI[sha256sum] = "b3d01b75b49a183b13f4f8c7fba5cebf4011e7d60d5f0df0238cd1f55a0550a5"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
