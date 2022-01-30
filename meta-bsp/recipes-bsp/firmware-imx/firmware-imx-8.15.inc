# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "431978c3ba4b58ed6a6fc3a7b9f296eb"
SRC_URI[sha256sum] = "4271c9847d9feb673edacc66de41503003667431b5330bca7bff893e9d68871a"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
