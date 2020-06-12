require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[md5sum] = "fc38578aa1878dfeef6db89f1bdda14f"
SRC_URI[sha256sum] = "f494cc11750df75b1d0af0e45308f715ceef107013886b905037ee7526ca6b94"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        rm ${D}${libdir}/libGL.so.1.2.0
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
