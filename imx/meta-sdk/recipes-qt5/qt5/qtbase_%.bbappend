# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-evdevtouch-Avoid-crashing-on-exit.patch "

HAS_X11 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 1, 0, d)}"
QT_CONFIG_FLAGS_APPEND_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -no-opengl -linuxfb -no-eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_mx6sl    = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -no-opengl -linuxfb -no-eglfs -no-widgets', d)}"

PACKAGECONFIG_append = " accessibility examples"
