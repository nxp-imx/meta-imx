require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "5fe8a74bc62a9b92e875c9abf6122178"
SRC_URI[sha256sum] = "726da1d9b17b7e47534c286480930f7560b8b47e4be976deb7294582a63177fc"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        rm ${D}${libdir}/libGL.so.1.2.0
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
