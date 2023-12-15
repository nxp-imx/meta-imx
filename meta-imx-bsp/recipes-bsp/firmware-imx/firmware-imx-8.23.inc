# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "120e81c2c9a98bea3afcc9742b823390"
SRC_URI[sha256sum] = "d347dffda064315fd210f66b35df2c6b5eeb06a35843fc3ff148b7e41e06fee3"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
