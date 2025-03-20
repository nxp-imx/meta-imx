# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021,2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc
inherit fsl-eula-unpack fsl-eula2 fsl-eula-recent
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"

IMX_SRCREV_ABBREV="394336b"
IMX_PACKAGE_VERSION = "${PV}"

SRC_URI = "${FSL_MIRROR}/${IMX_PACKAGE_NAME}.bin;fsl-eula=true"
SRC_URI[sha256sum] = "61b40623e1c2322f1ba85da57ab6949f749d02b3b5cbc2b1ef583a99b59e8968"

S = "${WORKDIR}/${IMX_PACKAGE_NAME}"
