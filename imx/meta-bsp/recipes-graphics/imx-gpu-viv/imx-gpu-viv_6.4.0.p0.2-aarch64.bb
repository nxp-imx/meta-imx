require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "fef7103facc9abca90d313442cd7b58c"
SRC_URI[sha256sum] = "f3809b1806077521437b9ac5d879fae437aac58423d137a7e63b8d5668f944c7"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        # FIXME: Use Wayland library on Wayland when build problem is fixed
        cp ${S}/gpu-core/usr/lib/libGL-x11.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
