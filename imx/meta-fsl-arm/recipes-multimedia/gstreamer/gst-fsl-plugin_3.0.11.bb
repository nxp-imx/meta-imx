# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "4146d4160437c897e29792ec33df48df"
SRC_URI[sha256sum] = "933235797331a7669322b002bea0c78b913eec348bac9954752c7e5e728a1d05"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
