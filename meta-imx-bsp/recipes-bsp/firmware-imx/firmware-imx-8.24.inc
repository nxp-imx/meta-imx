# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1142bc333cf4971d6b10bd8292363f02"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "c7757b9"
SRC_URI[md5sum] = "deafe627874e4f8a19720ea9848805ca"
SRC_URI[sha256sum] = "8eb92df98f0c85455cf3164e2509afbdafa269d8ad6c5f8d90fe5216c6819e9f"

S = "${WORKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
