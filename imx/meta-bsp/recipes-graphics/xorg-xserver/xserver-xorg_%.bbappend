# REPLACE meta-nxp-mx8
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch \
            file://0002-glamor_egl-Automatically-choose-a-GLES2-context-if-d.patch \
            file://0001-xfree86-Immediately-handle-failure-to-set-HW-cursor-.patch "

PACKAGECONFIG_append_mx8      = " glamor"
PACKAGECONFIG_append_imxgpu = " dri3 xshmfence dri glx"
