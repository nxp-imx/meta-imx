# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2017-2026 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

include imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d" 

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
SRC_URI[sha256sum] = "47439a576cfe018063058c3b6d97e46d9f6f1b0caa471e6b1480c31e63b8b55d"
IMX_SRCREV_ABBREV = "f7e2dd4"

inherit fsl-eula-unpack fsl-eula-recent

S = "${UNPACKDIR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}"

