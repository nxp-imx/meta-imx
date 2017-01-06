# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique
# Copyright (C) 2016 O.S. Systems Software LTDA.
# Copyright (C) 2016 Freescale Semiconductor

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx8 = " \
    file://0014-Add-IMX-GPU-support.patch \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', \
                                                   'file://0015-Add-eglfs-to-IMX-GPU.patch \
                                                    file://0016-Configure-eglfs-with-egl-pkg-config.patch', d)} \
"
SRC_URI_append_imxgpu2d = " \
    file://0014-Add-IMX-GPU-support.patch \
"
SRC_URI_append_imxgpu3d = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', \
                                                   'file://0015-Add-eglfs-to-IMX-GPU.patch \
                                                    file://0016-Configure-eglfs-with-egl-pkg-config.patch', d)} \
"

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
