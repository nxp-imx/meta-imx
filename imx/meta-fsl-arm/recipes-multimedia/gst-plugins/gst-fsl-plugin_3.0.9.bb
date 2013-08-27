# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/gst-plugins/gst-fsl-plugin.inc

SRC_URI[md5sum] = "3db863bef59234362f62891b227a6a94"
SRC_URI[sha256sum] = "bc8ffedcb9ebf584d2ec95e3a141be849d5f7becf30d88d9bcf48bc96b93ac72"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-3.10.9-1.0.0.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-3.10.9-1.0.0"

SRC_URI_append += "file://configure.ac-Use-pkg-config-sysroot-when-checking-fo.patch"

INCLUDE_DIR = "-I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"
EXTRA_OEMAKE = "INCLUDES="${INCLUDE_DIR}""
EXTRA_OECONF = "PLATFORM=${PLATFORM} --disable-valgrind --disable-examples --disable-debug CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
