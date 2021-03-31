# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "4c0d0660d8ed19f0e61ada2356121d79"
SRC_URI[sha256sum] = "6ef0bf55d501b665f1b8c382425ce7f99cb057b3012d1a4d7f3d4e89a7f2bb66"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
