# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2017-2026 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "Proprietary"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
SRC_URI[sha256sum] = "82242219e0d3536aeff31d9c215543bfe5541540bdb4fa8d61e83067b015e31f"
IMX_SRCREV_ABBREV = "464e9d8"

inherit fsl-eula-recent

S = "${UNPACKDIR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}"
