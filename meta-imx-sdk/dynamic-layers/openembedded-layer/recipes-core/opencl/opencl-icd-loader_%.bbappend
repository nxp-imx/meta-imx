do_install() {
	if [ "${OECMAKE_TARGET_INSTALL}" = "install" ]; then
		DESTDIR='${D}' cmake_runcmake_install
	else
		# Legacy path which supports also custom install targets
		DESTDIR='${D}' cmake_runcmake_build --target ${OECMAKE_TARGET_INSTALL}
	fi
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

# Enable mali-imx ICD implementation
RDEPENDS:${PN}:append:mx95-nxp-bsp = " mali-imx-opencl-icd"

RDEPENDS:${PN} += "opencl-headers"
