# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst1.0-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst1.0-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst1.0-fsl-plugins-${PV}"

SRC_URI[md5sum] = "9f716217e271d69d109a51f16e736825"
SRC_URI[sha256sum] = "24eaf51c45fab01e4f01618d270885affa474fb7dc6fb87a4cc8b99cea1d738b"

COMPATIBLE_MACHINE = "(mx6)"
