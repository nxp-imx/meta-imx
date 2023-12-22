# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "a602258c61cff0bbdb1d66d191cac4af"
SRC_URI[sha256sum] = "89bca6cf5f629f4fd4f2bb4a6beee427ec7afddd923f704445e471bee247bb29"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
