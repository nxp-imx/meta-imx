# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "d7dbaaf7cf898c0e80dd46f3b19117e5"
SRC_URI[sha256sum] = "3191f06039629aa9309b3b0164a7bbb6f220ad1dd66db04baf9153349b9f7758"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
