# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021,2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc
inherit fsl-eula-unpack fsl-eula2 fsl-eula-recent
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 

IMX_SRCREV_ABBREV = "464e9d8"
IMX_PACKAGE_VERSION = "${PV}"

SRC_URI = "${FSL_MIRROR}/${IMX_PACKAGE_NAME}.bin;fsl-eula=true"
SRC_URI[sha256sum] = "0246a62aeff33dbc2f78b0bf355a61e0c45fa9fdbf7f2c3a97585d295a8fc56a"

S = "${WORKDIR}/${IMX_PACKAGE_NAME}"
