# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8803ea5c6f4baa80ec0a36feb3d15a25"
SRC_URI[sha256sum] = "30b9b82f1870fba46a81b1dd38f9770d5533324ce2eb4221c48728fafb5c6f6d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
