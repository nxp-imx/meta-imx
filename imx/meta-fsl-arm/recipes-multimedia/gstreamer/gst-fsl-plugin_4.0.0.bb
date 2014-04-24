# Copyright (C) 2014, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "42bfa7311fb6dfe731da922496eaf81a"
SRC_URI[sha256sum] = "a48b18dbad8e21b51a653c53c768558fcaa42ff461c027bd87fa6978048b69fc"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
