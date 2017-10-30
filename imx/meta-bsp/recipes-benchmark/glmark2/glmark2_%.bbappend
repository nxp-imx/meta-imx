FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG_append_imxdrm = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', '', \
        bb.utils.contains('DISTRO_FEATURES', 'x11 opengl',     '', \
                                                               ' drm-gles2', d), d)}"

SRC_URI_append_imxdrm = " \
    file://0001-NativeStateDRM-add-imx-drm-driver-support.patch \
    file://0002-GLStateEGL-Use-eglGetPlatformDisplayEXT-when-possibl.patch \
    file://0003-drm-Initialize-the-page-flip-handler-to-0.patch \
"
