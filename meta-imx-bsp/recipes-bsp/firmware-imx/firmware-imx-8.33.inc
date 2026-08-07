# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2026 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "7ce4783"
SRC_URI[sha256sum] = "439a4fcb20d74fbbf0e1fd353c89b407afacfd4a791cdde986d91e436902794d"

S = "${UNPACKDIR}/firmware-imx-${PV}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack
