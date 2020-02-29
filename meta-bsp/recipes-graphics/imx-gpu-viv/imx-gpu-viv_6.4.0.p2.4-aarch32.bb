require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "fbc471fa40e454ac20b973943e45ea27"
SRC_URI[sha256sum] = "b03a68b74e4cb41b126aa3ea377a8da88bfb6e827d3404c7404c12c678e4d450"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
            cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
        fi
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
