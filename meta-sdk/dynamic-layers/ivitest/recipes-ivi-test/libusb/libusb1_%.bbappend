PROVIDES:append = " ${PN}-test"

PACKAGES:append = " ${PN}-test"

ALLOW_EMPTY:${PN}-test = '1'

EXTRA_OECONF:append = " --enable-tests-build"

do_install:append() {
	install -d ${D}${libdir}/${PN}-tests
	install -m 0755 ${WORKDIR}/build/tests/.libs/stress ${D}${libdir}/${PN}-tests/
}

FILES:${PN}-test += "${libdir}/${PN}-tests/*"
