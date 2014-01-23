# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "8c09d0c9a619313e36be0fef29cffd7a"
SRC_URI[sha256sum] = "ace5f8d24417c0c50994d42bf712e5c7d801afab2837c280c44bb86f4a46f52e"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
