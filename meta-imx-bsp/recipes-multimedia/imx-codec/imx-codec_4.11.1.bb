# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2017-2026 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

include imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
SRC_URI[sha256sum] = "af89c3ae043399ce8287798cc15813987f1131b63ff556922cab352487a6bb84"
IMX_SRCREV_ABBREV = "f7e2dd4"

inherit fsl-eula-recent

S = "${UNPACKDIR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}"

