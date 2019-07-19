# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "a411764eb5cc10bf888a1e1433cea570"
SRC_URI[sha256sum] = "af574e7ccc756214718f6558db44faa64bb94a1a6247ddabc83ea6824a30b13c"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
