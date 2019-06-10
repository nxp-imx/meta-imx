PROVIDES_append = " ${PN}-test"

PACKAGES_append = " ${PN}-test"

ALLOW_EMPTY_${PN}-test = '1'

EXTRA_OECONF_append = " --enable-tests-build"

do_install_append() {
	install -d ${D}${libdir}/${PN}-tests
	install -m 0755 ${WORKDIR}/build/tests/.libs/stress ${D}${libdir}/${PN}-tests/
}

FILES_${PN}-test += "${libdir}/${PN}-tests/*"
