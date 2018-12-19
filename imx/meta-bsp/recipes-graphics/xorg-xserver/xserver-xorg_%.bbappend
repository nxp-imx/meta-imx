# REPLACE meta-nxp-mx8
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch"
SRC_URI_remove = "file://0002-configure.ac-Fix-wayland-scanner-and-protocols-locat.patch"

PACKAGECONFIG_remove_mx8 = "glamor"

PACKAGECONFIG_append_imxgpu = " dri3 xshmfence dri glx"

EXTRA_OECONF_remove = "WAYLAND_PROTOCOLS_SYSROOT_DIR=${RECIPE_SYSROOT}"
