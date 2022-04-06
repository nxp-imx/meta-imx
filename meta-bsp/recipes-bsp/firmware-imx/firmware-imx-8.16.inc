# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "146006cdd6d0de6c24482b781418efa4"
SRC_URI[sha256sum] = "a152c75f9e5487ce3b3e9afc414c298f1b13a7659ab91a7e3e7ac292f3b2939a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
