# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI[md5sum] = "df25ec127e16b1e04407022df6892e75"
SRC_URI[sha256sum] = "52eb92d7fae210b47428c97fcbbad710892c574fa9e9de5fa2e2d57ea7027b79"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"


COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
