# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "d3e42efde2724bd47af816306e9aeca6"
SRC_URI[sha256sum] = "ccc1e03f648a3d927aa7690ea4e00ce0dcad60b854f59e14cafbd740c419c116"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
