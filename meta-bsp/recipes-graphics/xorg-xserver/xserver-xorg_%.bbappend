FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append_imxgpu = " \
    file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch \
    file://0001-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch \
    file://0002-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch \
    file://0001-prefer-to-use-GLES2-for-glamor-EGL-config.patch \
    file://xwayland-Make-glx-dependency-optional.patch \
"

PACKAGECONFIG_append_mx8 = " glamor"
PACKAGECONFIG_remove_mx8 = "dri dri2 glx"
