RDEPENDS:${PN}-tests = "python"

do_install:append() {
	install -d ${D}${libdir}/connman/test
        install -m 0755 ${S}/test/* ${D}${libdir}/connman/test/
}

FILES:${PN}-tests += "${libdir}/connman/test/*"
