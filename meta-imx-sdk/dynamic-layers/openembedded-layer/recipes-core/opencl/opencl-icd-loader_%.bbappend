do_install() {
    DESTDIR='${D}' cmake_runcmake_install
    install -m 0755 ${B}/icd_loader_test ${D}${bindir}/
    chrpath -d ${D}${bindir}/icd_loader_test
    install -m 0644 ${B}/libIcdLog.so ${D}${libdir}/
    install -m 0644 ${B}/libOpenCLDriverStub.so ${D}${libdir}/
    chrpath -d ${D}${libdir}/libOpenCLDriverStub.so
}

FILES:${PN} += " \
    ${bindir}/* \
"

FILES:${PN}-dev += " \
    ${libdir}/pkgconfig \
    ${libdir}/cmake \
    ${datadir}/cmake \
"

RDEPENDS:${PN} += "opencl-headers"
