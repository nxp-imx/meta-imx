FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch"
SRC_URI += "file://0002-glamor_egl-Automatically-choose-a-GLES2-context-if-d.patch"

PACKAGECONFIG_append_imxgpu2d = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'glamor dri3 xshmfence', '', d)} \
"

PACKAGECONFIG_remove_mx8mq = "glx"
