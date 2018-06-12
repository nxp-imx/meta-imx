FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG_append_imxdrm = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', '', \
        bb.utils.contains('DISTRO_FEATURES', 'x11 opengl',     '', \
                                                               ' drm-gles2', d), d)}"

