# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "88d0d593573965cc71927c6c4bf57c3e"
SRC_URI[sha256sum] = "93adb3873284efd127cd97e8b7b85e2163b57f63d331c30c698a2fd6723b36a1"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
