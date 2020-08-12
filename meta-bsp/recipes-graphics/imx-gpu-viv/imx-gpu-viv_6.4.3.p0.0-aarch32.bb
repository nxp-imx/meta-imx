require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI[md5sum] = "b0b48cff4e18fd7966be00c6c9d848b6"
SRC_URI[sha256sum] = "5a87872e828cb059258f4a7b0720c216b8701039c3e2002e3b5efb1a58dea59a"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        rm ${D}${libdir}/libGL.so.1.2.0
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
    # Install the newly versioned EGL library files
    rm ${D}${libdir}/libEGL.so.1.0
    cp ${S}/gpu-core/usr/lib/libEGL-${backend}.so ${D}${libdir}/libEGL.so.1.5
    ln -sf libEGL.so.1.5 ${D}${libdir}/libEGL.so.1
    ln -sf libEGL.so.1.5 ${D}${libdir}/libEGL.so
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
