# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "08a147b5a622a679e285fb53c59eb23b"
SRC_URI[sha256sum] = "7f92da3b06253afb5bd638175422eb5fc688fecc1ae49d2a523db0e3771d9c33"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
