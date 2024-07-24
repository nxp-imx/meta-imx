# Copyright 2024 NXP

DESCRIPTION = "NXP synchronous sample rate converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "3b7dd36"

SRC_URI[sha256sum] = "9bb3431b8dac6f0de8ef737d95f2fd50777c16029d620b6c780033295cbd171c"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack autotools pkgconfig

EXTRA_OECONF:append = " --enable-armv8 --bindir=/unit_tests/ --libdir=/usr/lib/"

FILES:${PN} += "/unit_tests/NXP_SSRC/* \
                /usr/share/* \
"

COMPATIBLE_MACHINE = "(mx9-nxp-bsp)"
