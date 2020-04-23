require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "bacf05067013d35b245dc0be4042e5cc"
SRC_URI[sha256sum] = "67e65f8e709f95259b684c7ff9eeee1cb90b2ca29bb016d01c9714e35c86d1fc"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
