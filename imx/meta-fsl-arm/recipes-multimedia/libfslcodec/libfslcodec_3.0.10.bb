# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "4ae623dfa833ab24e70f24a3016f1e53"
SRC_URI[sha256sum] = "29adaac045dca8e4bfb227d0f2376e35ba63b39dd09c2c5671f4ead7e38f08f2"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
