require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "543a0a4ca9764ea5b3dfa5ddc6666466"
SRC_URI[sha256sum] = "048af510add718549eceb0e21362bb9f0b2bfffa65df6ab73234f6a39db23623"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
            # FIXME: Use Wayland library on Wayland when build problem is fixed
            cp ${S}/gpu-core/usr/lib/libGL-x11.so ${D}${libdir}/libGL.so.1.2.0
        fi
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
