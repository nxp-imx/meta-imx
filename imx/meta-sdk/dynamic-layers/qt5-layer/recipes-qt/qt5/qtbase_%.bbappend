# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique
# Copyright (C) 2016 O.S. Systems Software LTDA.
# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                             'fb', d), d)}"

SRC_URI_append = " \
    file://qt5-${IMX_BACKEND}.sh \
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

PACKAGECONFIG_MX8_GPU     = ""
PACKAGECONFIG_MX8_GPU_mx8 = " gbm kms"
PACKAGECONFIG_append_imxgpu = " ${PACKAGECONFIG_MX8_GPU}"

# -eglfs is conditioned on GPU3D with FrameBuffer only
# -no-opengl -linuxfb are conditioned on GPU2D only
# Overwrite the original setting which is in meta-freescale layer
QT_CONFIG_FLAGS_APPEND_imxpxp = "-no-eglfs"
QT_CONFIG_FLAGS_APPEND_imxgpu2d = "-no-eglfs -no-opengl -linuxfb"
QT_CONFIG_FLAGS_APPEND_imxgpu3d = "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', \
        bb.utils.contains('DISTRO_FEATURES', 'wayland', '-no-eglfs', \
            '-eglfs', d), d)}"
QT_CONFIG_FLAGS_append = " ${QT_CONFIG_FLAGS_APPEND}"

QT_CONFIG_FLAGS_MX8_GPU     = ""
QT_CONFIG_FLAGS_MX8_GPU_mx8 = "-eglfs -kms"
QT_CONFIG_FLAGS_append_imxgpu = " ${QT_CONFIG_FLAGS_MX8_GPU}"

PACKAGECONFIG_WAYLAND ?= "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'xkbcommon-evdev', '', d)}"
PACKAGECONFIG += "${PACKAGECONFIG_WAYLAND}"

do_install_append () {
    if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
        sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
    fi
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt5-${IMX_BACKEND}.sh ${D}${sysconfdir}/profile.d/qt5.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/qt5.sh"
