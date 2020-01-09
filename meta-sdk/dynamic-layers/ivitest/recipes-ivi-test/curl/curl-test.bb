DESCRIPTION = "Package for testing libcurl"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://libcurl-simple-test.c \
	   file://README \
	  "
S = "${WORKDIR}"

PACKAGES = "${PN} ${PN}-dbg"

DEPENDS = "curl"

LDFLAGS_append = " -lcurl"

do_compile() {
	${CC} ${CFLAGS} ${WORKDIR}/libcurl-simple-test.c ${LDFLAGS} -o libcurl-simple-test
}

do_install() {
	install -m 0755 -d ${D}${libdir}/${PN}
	install -m 0755 libcurl-simple-test ${D}${libdir}/${PN}/
}

FILES_${PN} = "${libdir}/${PN}/*"
FILES_${PN}-dbg = "${prefix}/src/* ${libdir}/${PN}/.debug/*"
