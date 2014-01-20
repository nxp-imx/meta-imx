# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "da815bb3fca773d915d6e473e13e3c2b"
SRC_URI[sha256sum] = "23f656bdf0780a1a7d247ed07bd81b5849e9faafc32c2f5181d742d0dc875aba"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
