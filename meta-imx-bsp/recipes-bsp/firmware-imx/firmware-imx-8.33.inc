# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "4c7a65d"
SRC_URI[sha256sum] = "cdd8582e18c4b44c47d778c4c62547eabdef3fe8a87bf490d9145f9e218f9d83"

S = "${UNPACKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
