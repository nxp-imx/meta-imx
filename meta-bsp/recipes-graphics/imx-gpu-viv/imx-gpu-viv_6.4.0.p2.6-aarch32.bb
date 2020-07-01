require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "6c7f4fcb6faf42f934792d7f9cf374dd"
SRC_URI[sha256sum] = "3043f112c1d349e584053e199f1f18f0d5e81ab031d45059e1db461544f34afc"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        rm ${D}${libdir}/libGL.so.1.2.0
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
