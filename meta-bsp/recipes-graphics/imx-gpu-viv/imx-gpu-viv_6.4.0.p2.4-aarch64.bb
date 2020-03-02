require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "6e8d6a9c3a9f00809bfe70bdccf7f829"
SRC_URI[sha256sum] = "fdec9bbeca01f0deaf1ff9b84f4567a79f70cf5332e2a5e99fb4b5d0ce1d3adc"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
