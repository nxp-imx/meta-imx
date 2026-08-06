# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "1d6b45d"
SRC_URI[sha256sum] = "07c850ed1351ec75274c6b7fbdfb3b4599d59525d7b0e78370a19f883de8816f"

S = "${UNPACKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
