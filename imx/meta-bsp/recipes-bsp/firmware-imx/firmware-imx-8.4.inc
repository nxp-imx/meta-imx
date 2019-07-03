# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "871bad66738b5805c7602ae22d64ee54"
SRC_URI[sha256sum] = "d35df7d4ecde5719b8d7dd502a8fe81842f231ca58c9c2aa1a32dc4f4d542146"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
