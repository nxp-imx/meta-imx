# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "d53a6007129087b40e55c59b75b10968"
SRC_URI[sha256sum] = "bec1ebcc128a992de9ef991f6668b0e5dfd45bf97bb4ed8575b65702457b88b1"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
