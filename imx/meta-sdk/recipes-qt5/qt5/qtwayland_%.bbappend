FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://0001-Avoid-attaching-NULL-buffer-while-hiding-EGL-windows.patch \
"
XKB_DEPENDS_remove = "libxkbcommon xproto"
DEPENDS_remove = "libxcomposite"
QT_WAYLAND_CONFIG = ""

#FIXME: xkb should be optional; we add it here to fix the build error without it
#       (https://bugreports.qt.io/browse/QTBUG-54851)
PACKAGECONFIG ?= " \
    compositor-api \
    wayland-egl \
    xkb \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xcompositor xkb glx', '', d)} \
"

# Qt projects may support package filtering via the construct 'contains(CONFIG, package)'.
# In this case the PACKAGECONFIG is straightforward and looks like this:
#   PACKAGECONFIG[package] = "CONFIG+=package"
# Otherwise, it is also possible to add filtering for cached packages that are
# controlled by the construct 'qtCompileTest(package)'. In this case we can fool
# the caching mechanism into not building a package by setting a flag done_config_package:
#   PACKAGECONFIG[package] = ",CONFIG+=done_config_package"
PACKAGECONFIG[compositor-api] = "CONFIG+=wayland-compositor"
PACKAGECONFIG[xcompositor] = ",CONFIG+=done_config_xcomposite,libxcomposite"
PACKAGECONFIG[glx] = ",CONFIG+=done_config_glx,virtual/mesa"
PACKAGECONFIG[xkb] = ",CONFIG+=done_config_xkbcommon,libxkbcommon xproto"
PACKAGECONFIG[wayland-egl] = ",CONFIG+=done_config_wayland_egl,virtual/egl"
PACKAGECONFIG[brcm-egl] = ",CONFIG+=done_config_brcm_egl,virtual/egl"
PACKAGECONFIG[drm-egl] = ",CONFIG+=done_config_drm_egl_server,libdrm virtual/egl"
PACKAGECONFIG[libhybris-egl] = ",CONFIG+=done_config_libhybris_egl_server,libhybris"

EXTRA_QMAKEVARS_PRE += "${PACKAGECONFIG_CONFARGS}"

PACKAGECONFIG_remove_mx6 = "xcompositor"
PACKAGECONFIG_remove_mx6ul = "xcompositor"
PACKAGECONFIG_remove_mx7 = "xcompositor"
PACKAGECONFIG_remove_mx8 = "xcompositor"
