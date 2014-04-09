# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst1.0-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst1.0-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst1.0-fsl-plugins-${PV}"

SRC_URI[md5sum] = "079cd90b23e2d6cac702ba3cb8d26b54"
SRC_URI[sha256sum] = "2043b78e9888c4cb33e6616f2f1add7e8747a727317bcdf891050744d178afe2"

COMPATIBLE_MACHINE = "(mx6)"
