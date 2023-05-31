# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "25c50f3371450b2324401ee06ff1bf6a"
SRC_URI[sha256sum] = "f6dc6a5c8fd9b913a15360d3ccd53d188db05a08a8594c518e57622478c72383"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
