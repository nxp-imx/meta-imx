# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique
# Copyright (C) 2016 O.S. Systems Software LTDA.
# Copyright (C) 2016 Freescale Semiconductor

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_IMXGPU_COMMON = " \
    file://0014-Add-IMX-GPU-support.patch \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
       bb.utils.contains('DISTRO_FEATURES',     'x11', '', \
                                                       'file://0015-Add-eglfs-to-IMX-GPU.patch', d), d)} \
"
SRC_URI_IMXGPU          = ""
SRC_URI_IMXGPU_mx8      = "${SRC_URI_IMXGPU_COMMON}"
SRC_URI_IMXGPU_imxgpu2d = "${SRC_URI_IMXGPU_COMMON}"
SRC_URI_IMXGPU_imxgpu3d = "${SRC_URI_IMXGPU_COMMON}"
SRC_URI_append = " ${SRC_URI_IMXGPU}"

PACKAGECONFIG_GL_mx8 = "gles2"
PACKAGECONFIG_GL_imxpxp   = "gles2"
PACKAGECONFIG_GL_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' gl', '', d)}"
PACKAGECONFIG_GL_imxgpu3d = "gles2"

QT_CONFIG_FLAGS_APPEND = ""
QT_CONFIG_FLAGS_APPEND_mx8 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', '-eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_imxpxp = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', '-eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', '-no-opengl -linuxfb -no-eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_imxgpu3d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', '-eglfs', d)}"
QT_CONFIG_FLAGS_append = " ${QT_CONFIG_FLAGS_APPEND}"

PACKAGECONFIG_append = " accessibility examples"
