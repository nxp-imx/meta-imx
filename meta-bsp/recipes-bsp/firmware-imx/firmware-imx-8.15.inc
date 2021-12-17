# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "f1abef156f4e436a9b188f06a3bf49e6"
SRC_URI[sha256sum] = "473a3b14c63dbe5b8a1041f2765cbb2d80708247afadfd954ac12e2d4bcb8637"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
