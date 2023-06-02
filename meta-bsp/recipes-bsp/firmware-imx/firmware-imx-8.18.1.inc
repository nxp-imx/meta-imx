# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "e7c4fe3105239825e14503a081178763"
SRC_URI[sha256sum] = "e1bbd9ef7ef140a291f10ddcc27461cc7e8ff6043573266f8566446d40e892b4"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
