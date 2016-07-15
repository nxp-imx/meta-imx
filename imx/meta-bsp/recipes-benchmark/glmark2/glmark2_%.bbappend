FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://glmark2.patch"

PACKAGECONFIG_mx8 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gl x11-gles2', \
                         bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', '', d), d)}"
