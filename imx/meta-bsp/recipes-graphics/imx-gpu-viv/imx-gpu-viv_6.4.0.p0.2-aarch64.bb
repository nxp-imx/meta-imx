require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "b05f815eca976321ebc8046b053b4f8c"
SRC_URI[sha256sum] = "4622ad37af572599426366e0230533f6df5232544fde5e8da34b5f8771d22622"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        # FIXME: Use Wayland library on Wayland when build problem is fixed
        cp ${S}/gpu-core/usr/lib/libGL-x11.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx8)"
