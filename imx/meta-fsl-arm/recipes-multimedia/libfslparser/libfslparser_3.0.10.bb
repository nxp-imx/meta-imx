# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "3bf9fb2077845057a7d306cc624ea29a"
SRC_URI[sha256sum] = "a965996fecab7caf1684974c07f4c3fbd8998fa033bf92a2c5e7e03116d40fc4"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
