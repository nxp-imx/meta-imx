# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "7967baa3623b864e06c478e446299b1e"
SRC_URI[sha256sum] = "3a6d7d418551a18949b07c2c21904e819682dc6fe43774a5f9e62e48be7810c3"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
