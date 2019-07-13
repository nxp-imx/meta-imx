require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[md5sum] = "8dc194a5a42c2dbc62b9471dc44479c1"
SRC_URI[sha256sum] = "068448365e2f7e98b2c5bfa0f3d4c2698ee36b4c0df296c94e126a15bb6d5a32"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
