FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch \
            file://0001-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch \
            file://0002-MGS-5186-Per-Specification-EGL_NATIVE_PIXMAP_KHR-req.patch \
            file://0001-prefer-to-use-GLES2-for-glamor-EGL-config.patch"

SRC_URI_append_imxgpu = " \
            file://0003-Remove-GL-library-and-dependency-from-xwayland.patch \
"

IMX_OPENGL_PKGCONFIGS_REMOVE_imxgpu = "dri glx glamor"

PACKAGECONFIG_append_mx8 = " glamor"
