# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "e44832c7c1860a90bc6d7f789a1cd093"
SRC_URI[sha256sum] = "b411fc87f613e7b71e1ceed1752a871df8a976aa9622e8bfa86593d42855ff5e"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
