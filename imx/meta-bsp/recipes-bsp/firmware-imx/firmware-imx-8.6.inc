# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "354306bcffeb672a4f25410416d5d64b"
SRC_URI[sha256sum] = "4e2a96e103e764409ae02136336faeeb96afc376b432108a06d624a938831a10"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
