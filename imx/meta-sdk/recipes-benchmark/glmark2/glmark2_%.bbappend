FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-glad-Fix-EGL-loading-for-EGL_NO_DISPLAY-on-EGL-1.5-a.patch"

PACKAGECONFIG_append_imxdrm = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', '', \
        bb.utils.contains('DISTRO_FEATURES', 'x11 opengl',     '', \
                                                               ' drm-gles2', d), d)}"

