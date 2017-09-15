# REPLACE meta-nxp-mx8
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch"
SRC_URI += "file://0002-glamor_egl-Automatically-choose-a-GLES2-context-if-d.patch"

PACKAGECONFIG_append_imxgpu3d = " \
    ${@bb.utils.contains('DISTRO_FEATURES',    'wayland', '', \
       bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'glamor dri3', \
                                                          '', d), d)} \
    ${@bb.utils.contains('DISTRO_FEATURES',     'opengl', 'xshmfence', '', d)}"

PACKAGECONFIG_remove_mx8mq = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'dri glx', '', d)}"
