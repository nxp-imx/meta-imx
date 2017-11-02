# REPLACE meta-nxp-mx8
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch"
SRC_URI += "file://0002-glamor_egl-Automatically-choose-a-GLES2-context-if-d.patch"

PACKAGECONFIG_append_imxgpu3d = " glamor dri3 xshmfence dri glx"
