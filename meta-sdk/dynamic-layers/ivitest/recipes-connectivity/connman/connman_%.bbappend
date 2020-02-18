RDEPENDS_${PN}-tests = "python"

do_install_append() {
	install -d ${D}${libdir}/connman/test
        install -m 0755 ${S}/test/* ${D}${libdir}/connman/test/
}

FILES_${PN}-tests += "${libdir}/connman/test/*"
