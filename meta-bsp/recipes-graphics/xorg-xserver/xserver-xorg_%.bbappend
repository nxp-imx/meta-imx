FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# Trailing space is intentional due to a bug in meta-freescale
SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch \
            file://0001-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch \
            file://0002-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch"

PACKAGECONFIG_append_mx8 = " glamor"
