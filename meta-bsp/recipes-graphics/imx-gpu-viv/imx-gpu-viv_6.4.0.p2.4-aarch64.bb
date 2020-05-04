require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "adbe98802e3ecd048cd793c6d24b6e86"
SRC_URI[sha256sum] = "b984fa420e37b46c2f4f0dc71e0fc21d429cc9d0597574206a03364aff5e8522"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
