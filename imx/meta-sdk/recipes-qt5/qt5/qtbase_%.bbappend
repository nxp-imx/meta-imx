# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique
# Copyright (C) 2016 O.S. Systems Software LTDA.
# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                             'fb', d), d)}"

SRC_URI_append = " \
    file://qt5-${IMX_BACKEND}.sh \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', \
        'file://0001-xcb-Ignore-XI2-LMB-mouse-events-from-touch-screens.patch', \
        '', d)} \
"
SRC_URI_append_imxgpu = " \
    file://0014-Add-IMX-GPU-support.patch \
    file://0001-egl.prf-Fix-build-error-when-egl-headers-need-platfo.patch \
"
SRC_URI_append_imxgpu3d = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', \
        '', \
        'file://0015-Add-eglfs-to-IMX-GPU.patch \
         file://0016-Configure-eglfs-with-egl-pkg-config.patch', d)} \
"

PACKAGECONFIG_GL_imxpxp   = "gles2"
PACKAGECONFIG_GL_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'gl', '', d)}"
PACKAGECONFIG_GL_imxgpu3d = "gles2"
PACKAGECONFIG_append = " accessibility examples"

QT_CONFIG_FLAGS_IMX_NOT_X11_imx      = "-eglfs"
QT_CONFIG_FLAGS_IMX_NOT_X11_imxgpu2d = "-no-opengl -linuxfb -no-eglfs"
QT_CONFIG_FLAGS_IMX_NOT_X11_imxgpu3d = "-eglfs"
QT_CONFIG_FLAGS_append_imx = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', \
    '-no-eglfs', \
    '${QT_CONFIG_FLAGS_IMX_NOT_X11}', d)}"

do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt5-${IMX_BACKEND}.sh ${D}${sysconfdir}/profile.d/qt5.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/qt5.sh"
