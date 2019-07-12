require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[md5sum] = "50fd9f488900a364a41ebbe3d11a3a4f"
SRC_URI[sha256sum] = "f77b08525ce698b46d60ed728c419fcefb71db342311cfa4c073cc6395c512ce"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        mv ${D}${libdir}/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
