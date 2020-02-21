require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "ca05bac09ff357910a3deb2e7c9e8b1d"
SRC_URI[sha256sum] = "7223ac5adeeaffd07a3bbddc7e0be2f67b635f26c8e61bb084bebb65b2c6c3dd"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
