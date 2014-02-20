# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "dc0c9758f8f62a4b30dfcd46a98593b3"
SRC_URI[sha256sum] = "6ac4e6887a38a0d34bbe836a78396e40012830af8e01991747fedbddc78c16b4"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
