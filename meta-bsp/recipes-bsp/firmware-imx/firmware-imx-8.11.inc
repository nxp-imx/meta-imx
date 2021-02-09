# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "663942fabdf8808c2aa9cfbd21c48cc2"
SRC_URI[sha256sum] = "1a7aaab69cd8c48d10ffb0118c938f4b3daf4c7fd86f0342f4d352906f8e0ecb"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
