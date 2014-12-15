# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "26b294cb7bc61843ea6fbcee7d2013d8"
SRC_URI[sha256sum] = "4547e81f4973955c4ba2f722e91c6667a8674c2db8ee8e06df859a58aec445c1"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
