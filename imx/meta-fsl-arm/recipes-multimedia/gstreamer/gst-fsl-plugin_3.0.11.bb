# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "75470e5eb0ccce09f4ea170093a05074"
SRC_URI[sha256sum] = "44361ca1b92d177df673416b19366ef5efbbd2b0d5fc1f426a0bc5b83715db2a"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
