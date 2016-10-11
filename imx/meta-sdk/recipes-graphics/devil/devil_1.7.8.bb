DESCRIPTION = "A full featured cross-platform image library"
SECTION = "libs"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"
PR = "r0"

DEPENDS = "libpng jpeg"
RDEPENDS_${PN} += "libpng "

SRC_URI = "http://sourceforge.net/projects/openil/files/DevIL/1.7.8/DevIL-${PV}.zip \
           file://il_manip_c.patch \
           file://il_manip_h.patch \
           file://M4Patch.patch \
           file://Fix-GCC-5.2-erros.patch"
SRC_URI[md5sum] = "312853ef9c85ad7b2100f9cd068b2a5b"
SRC_URI[sha256sum] = "4368d83b3016b5eafe8984f0d7f86ccee76b8993cf900d3a8cbd4901b52f64eb"

PACKAGE_ARCH = "${MACHINE_ARCH}"
S = "${WORKDIR}/devil-${PV}"

TARGET_CFLAGS += "-Dpng_set_gray_1_2_4_to_8=png_set_expand_gray_1_2_4_to_8"

inherit autotools

do_compile() {
	oe_runmake	
}

do_install() {
	oe_runmake install DESTDIR=${D} SBINDIR=${sbindir} INCLUDEDIR=${includedir}
}
