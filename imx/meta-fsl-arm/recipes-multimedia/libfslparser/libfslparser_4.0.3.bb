# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "723bbecbd14b26dba6ef22cf086ad4d7"
SRC_URI[sha256sum] = "5a6393ff4cbe2781034d0864c2032321c08b85ec742153b169391950ee1022cd"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
