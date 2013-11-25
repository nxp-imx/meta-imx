# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI[md5sum] = "6be5ee8f6f2b41b0f7cd3f2691665617"
SRC_URI[sha256sum] = "d76b74b50abae5a214b482ba9a7342c21cb9e7698c6723ae07f9d615cb962d9f"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
