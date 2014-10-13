# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "a535c65278d95682868b094a0cd3011a"
SRC_URI[sha256sum] = "5667fac13a9ccf73ebd33a698eb9b986146608248f7980fdc045b191f7f4f0f7"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
