# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "98f8e8b48df98ab5e54c0599be2ac97c"
SRC_URI[sha256sum] = "4a768d754f0062270accc4e9f9202e1bf3208a30fbff0df4e892353b4b248557"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
