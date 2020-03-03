# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "687362bc30bc8caf89ca9b311b4a3df3"
SRC_URI[sha256sum] = "38af72fafe905dfe78210b1ddf02b83c352fdeb4ffb1be6c6ef0657f89c60ecd"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
