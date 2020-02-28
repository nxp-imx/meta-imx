# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "41d71b482e47409219756dfd0880359c"
SRC_URI[sha256sum] = "63720c58c19242eca8a26050df1b7769b2d9f193c493befebc007860798add47"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
