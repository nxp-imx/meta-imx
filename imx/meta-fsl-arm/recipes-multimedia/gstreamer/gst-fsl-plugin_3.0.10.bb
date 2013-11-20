# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI[md5sum] = "570e2aa9b64efd030e9950563e4eba4a"
SRC_URI[sha256sum] = "e048b7fc5cb2cb407c9a718a81847db2bd80a46f40df55fa7e69f564d3fb02a5"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
