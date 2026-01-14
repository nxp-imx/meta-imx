# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2025 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "b584ffe"
SRC_URI[sha256sum] = "22302d3633d733007c04e0fde9403599321a746cbb3f72c86b619221ae2ce7fb"

S = "${UNPACKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
