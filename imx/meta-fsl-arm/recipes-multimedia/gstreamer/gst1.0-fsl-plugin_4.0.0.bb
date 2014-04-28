# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst1.0-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst1.0-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst1.0-fsl-plugins-${PV}"

SRC_URI[md5sum] = "91dfe3d2789e3eea75184b0d1838ef32"
SRC_URI[sha256sum] = "3e741cef131f29b413f556735ece81f5315ab6a831b162ffaf7b574822c895b5"

COMPATIBLE_MACHINE = "(mx6)"
