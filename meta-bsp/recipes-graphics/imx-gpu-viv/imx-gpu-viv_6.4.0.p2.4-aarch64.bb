require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "5c06a2b3b10a2ce875d5cb2e7433fc9b"
SRC_URI[sha256sum] = "3b7720b8bfd2f08ef4c85ab0fa4e257b168a7e8ec11e03a0e6c984ca53fcefff"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
