# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "7858d7b6aa234a4deb3db0eda06e77f1"
SRC_URI[sha256sum] = "2d0ab1b250704ae904c809d696b44cdc18a98dc6c88da4241017da6804f1b3b7"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
