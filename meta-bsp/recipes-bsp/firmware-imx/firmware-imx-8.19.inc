# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "5228cca9bac48a5fe733b886884cf2ab"
SRC_URI[sha256sum] = "a4102a48e8b9031a06036bdffd0a99e26216aad80f40e6cd4a3a5409be278bb5"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
