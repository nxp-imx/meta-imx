# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "12cee7b5ed27f5e4e94e59fc1b74d4a9"
SRC_URI[sha256sum] = "13a7290431c258e0e42ba4e8fd6d945304effb642c206fcc471e4e37d37fcd80"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
