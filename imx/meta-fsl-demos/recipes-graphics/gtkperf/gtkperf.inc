SUMMARY = "GTK Performance tool"
DESCRIPTION = "GTK Performance tools"
SECTION = "libs"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "http://prdownloads.sourceforge.net/gtkperf/gtkperf_${PV}.tar.gz \
           file://Makevars"

S = "${WORKDIR}/gtkperf"

inherit autotools binconfig pkgconfig gettext

do_configure_prepend () {
	rm -f ${S}/m4/init.m4
	cp -f ${WORKDIR}/Makevars ${S}/po/
}

do_install_append () {
     rm -rf ${WORKDIR}/image/usr/doc
}

FILES_${PN}-dbg += "${bindir}/gtkperf}/*/.debug/gtkperf"
#FILES_${PN}-dev += "${bindir}/gtkperf"
FILES_${PN} += "${bindir}/gtkperf ${exec_prefix}/share/duck.png"

