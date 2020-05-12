# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "9898698383a729e3fbe83d122853ac13"
SRC_URI[sha256sum] = "4678bc831b6ea75de6fc1d5ab756fadea80a9e81c6f230fd3b07998ceaad0f2d"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
