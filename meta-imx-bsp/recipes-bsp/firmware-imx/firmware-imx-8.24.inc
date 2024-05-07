# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2023 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "11c647b"
SRC_URI[md5sum] = "7dac040dbf95f10de432ac1a0340f236"
SRC_URI[sha256sum] = "96631b6e0057cb83ce18252e411b8a8da77a000a6ed80ef820a684e42a1941c6"

S = "${WORKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
