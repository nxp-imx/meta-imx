require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "5614d82997039179bdb617e3d323f48f"
SRC_URI[sha256sum] = "f1fe32ab53a771a510681384887c50297e86a3b780acc986c36ff44e6c177a59"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
            # FIXME: Use Wayland library on Wayland when build problem is fixed
            cp ${S}/gpu-core/usr/lib/libGL-x11.so ${D}${libdir}/libGL.so.1.2.0
        fi
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
