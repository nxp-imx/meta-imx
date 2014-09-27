# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "fc3b75bfd69d27f61fb2151f4ff26f5b"
SRC_URI[sha256sum] = "3b318eaa010389c0edaded1ae69bcc3f38ae727986f4be35f1d57c292d76d864"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
