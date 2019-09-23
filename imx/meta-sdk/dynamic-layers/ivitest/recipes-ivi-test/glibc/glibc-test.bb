DESCRIPTION = "Package for testing GNU libc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " file://glibc-simple-test.c \
	    file://glibc-simple-test.cpp \
	    file://README \
	  "
S = "${WORKDIR}"

PACKAGES = "${PN} ${PN}-dbg"

DEPENDS = "glibc"

do_compile() {
	${CC} ${CFLAGS} ${WORKDIR}/glibc-simple-test.c ${LDFLAGS} -o glibc-simple-test
	${CXX} ${CXXFLAGS} ${WORKDIR}/glibc-simple-test.cpp ${LDFLAGS} -o glibc-simple-test-cxx
}

do_install() {
	install -m 0755 -d ${D}${libdir}/${PN}
	install -m 0755 glibc-simple-test ${D}${libdir}/${PN}/
	install -m 0755 glibc-simple-test-cxx ${D}${libdir}/${PN}/
}

FILES_${PN} = "${libdir}/*"
FILES_${PN}-dbg = "${prefix}/src/*"
