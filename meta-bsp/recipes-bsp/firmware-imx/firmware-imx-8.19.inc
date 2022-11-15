# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2767e8555c7ddc1ae39e42e0165d5f16"
SRC_URI[sha256sum] = "73994a68e9df3fd893cb371a7f4f1128cb1efcefa9a80ce66a0525b1c464b44f"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
