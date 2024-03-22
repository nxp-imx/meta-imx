# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1142bc333cf4971d6b10bd8292363f02"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "f07448f"
SRC_URI[md5sum] = "a7ecdac2e202f1a3b4f3a4e4df5e84a8"
SRC_URI[sha256sum] = "7c8485eca176519436378151f298aa202c4f92dacf1af73db67518bb25dfdaa3"

S = "${WORKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
