# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "425b8fbe81765b7cde965aca5156f17d"
SRC_URI[sha256sum] = "84e7b9847e35bed92478433b6adb519e1d10b50b82a0c80c8a99bd60cffe4d26"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
