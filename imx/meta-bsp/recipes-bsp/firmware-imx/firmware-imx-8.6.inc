# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "f81037bf5b0802a236161ce3483e8a65"
SRC_URI[sha256sum] = "e0e145003683f1ec8dbec6c2f157ec8d27161dd04e985f3e159162a36fb79be0"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
