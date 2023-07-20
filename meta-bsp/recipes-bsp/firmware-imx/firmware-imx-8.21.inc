# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "8a57e046d18784bd284a693d24ba225f"
SRC_URI[sha256sum] = "e646d026390250f2efe714c4a5b69c52659d88fc2f5ba346ec040a9f37e0a5cf"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
