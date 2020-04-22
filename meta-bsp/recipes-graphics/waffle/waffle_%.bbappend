FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-meson-Add-missing-wayland-dependency-on-EGL.patch \
    file://0002-meson-Separate-surfaceless-option-from-x11.patch \
"

PACKAGECONFIG_imxgpu_remove_mx6 = "gbm"
PACKAGECONFIG_imxgpu_remove_mx7 = "gbm"
