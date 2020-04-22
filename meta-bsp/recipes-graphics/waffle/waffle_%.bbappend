FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-meson-Add-missing-wayland-dependency-on-EGL.patch \
"

# Append EGL_CFLAGS to CFLAGS
CFLAGS_append_imxgpu = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DEGL_API_FB', d)} \
"

PACKAGECONFIG_imxgpu_remove_mx6 = "gbm x11-egl"
PACKAGECONFIG_imxgpu_remove_mx7 = "gbm x11-egl"
