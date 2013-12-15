# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI[md5sum] = "b4a85aa43a2ef498e97ef06f1c623f12"
SRC_URI[sha256sum] = "cb53e317294e9287219526670f676a65816f77d7a25f54019168642ed1362211"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
