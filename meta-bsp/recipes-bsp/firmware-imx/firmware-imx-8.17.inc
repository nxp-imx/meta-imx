# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "23f6f3d2c3c4b117191b712687dc7b97"
SRC_URI[sha256sum] = "0c17175d77fe0e0723a68d55b6b89629a45c84bc71808eb90938361ffb225abb"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
