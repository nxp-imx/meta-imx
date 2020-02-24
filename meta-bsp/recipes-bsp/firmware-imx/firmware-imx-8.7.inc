# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "1ab98d9fcfb35730b717ee71c55c27ad"
SRC_URI[sha256sum] = "25ae47f85cef4fb935a7a90cfa8548d591dba4392dc97857ea1d3a9d05addf47"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
