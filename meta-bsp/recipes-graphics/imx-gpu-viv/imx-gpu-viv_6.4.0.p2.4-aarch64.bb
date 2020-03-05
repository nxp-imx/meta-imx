require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "d8eb891e64629848dc74731231d9d714"
SRC_URI[sha256sum] = "7b99b9b8ff9decfcc1633fc57df069af3816960e1010035843afe5a9e3f2e0f6"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
