# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "2c1d05db80909247c033dc926707a0f4"
SRC_URI[sha256sum] = "5ae974433e28b64881176489e223c1f93fbaf77139f268511f1996450dd19ac0"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
