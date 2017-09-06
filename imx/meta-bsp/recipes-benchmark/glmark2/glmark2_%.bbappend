# Enable drm-gles2 for mx8qm/mx8qxp in FB backend
# Keep the previous setting in x11/wayland backend
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG_mx8qm = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', \
                           bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gl x11-gles2', 'drm-gles2', d), d)}"

PACKAGECONFIG_mx8qxp = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', \
                           bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gl x11-gles2', 'drm-gles2', d), d)}"


SRC_URI_append_mx8qm = " file://0001-NativeStateDRM-add-imx-drm-driver-support.patch \
                         file://0002-GLStateEGL-Use-eglGetPlatformDisplayEXT-when-possibl.patch \
"
SRC_URI_append_mx8qxp = " file://0001-NativeStateDRM-add-imx-drm-driver-support.patch \
                          file://0002-GLStateEGL-Use-eglGetPlatformDisplayEXT-when-possibl.patch \
"
