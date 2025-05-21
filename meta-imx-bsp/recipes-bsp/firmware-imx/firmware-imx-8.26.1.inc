# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2025 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "410be01"
SRC_URI[sha256sum] = "7f4db97929e070df0792892e3fb01ba4b9939bf17bbf0e3040a6db3e60b2a097"

S = "${WORKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
