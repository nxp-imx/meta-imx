# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI[md5sum] = "e47a4f2b05031fdfdcd6d0fe12e4bb1c"
SRC_URI[sha256sum] = "24989b7dde6b2465be8c4afffdf82c594fdd711c66d2494d22c472e4b709ba15"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
