# REPLACE meta-nxp-mx8
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-glamor-Use-CFLAGS-for-EGL-and-GBM.patch \
            file://0003-Remove-check-for-useSIGIO-option.patch"

PACKAGECONFIG_append_imxgpu = " dri3 xshmfence dri glx"
