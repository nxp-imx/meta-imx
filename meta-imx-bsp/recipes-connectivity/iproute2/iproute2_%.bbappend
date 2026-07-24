do_install:append:imx-generic-bsp () {
    cp -Rf --no-preserve=ownership ${B}/include/* ${D}${includedir}
    # Remove files that conflict with glibc
    rm -f ${D}${includedir}/dlfcn.h
    rm -f ${D}${includedir}/netinet/tcp.h
    rm -f ${D}${includedir}/xtables.h

}

do_install:append:qoriq-generic-bsp () {
    cp -Rf --no-preserve=ownership ${B}/include/* ${D}${includedir}
    # Remove files that conflict with glibc
    rm -f ${D}${includedir}/dlfcn.h
    rm -f ${D}${includedir}/netinet/tcp.h
    rm -f ${D}${includedir}/xtables.h
}
