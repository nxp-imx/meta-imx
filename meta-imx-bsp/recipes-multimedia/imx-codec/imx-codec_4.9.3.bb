# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021,2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc
inherit fsl-eula-unpack fsl-eula2 fsl-eula-recent
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"

IMX_SRCREV_ABBREV="394336b"
IMX_PACKAGE_VERSION = "${PV}"

SRC_URI = "${FSL_MIRROR}/${IMX_PACKAGE_NAME}.bin;fsl-eula=true"
SRC_URI[sha256sum] = "c43b4dbc2e9da8d87ac075b8683645630c5cfd4399ba5007507ba968815e134a"

S = "${WORKDIR}/${IMX_PACKAGE_NAME}"
