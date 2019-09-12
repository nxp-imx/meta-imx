require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "904af3a4ca76d26144a9f39854431000"
SRC_URI[sha256sum] = "a4156c98e4331f98d3e05d2e00bd4fe79d61fedec6e385b1731c82caee22fa8c"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        # FIXME: Use Wayland library on Wayland when build problem is fixed
        cp ${S}/gpu-core/usr/lib/libGL-x11.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
