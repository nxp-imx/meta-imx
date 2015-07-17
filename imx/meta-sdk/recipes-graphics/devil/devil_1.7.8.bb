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
		   file://M4Patch.patch "
SRC_URI[md5sum] = "0103b909e19ca9c6497a7ae696c16480"
SRC_URI[sha256sum] = "818a4b8bbcb50878a8b1b9f71b4274d242ab46bf860c74676e98dec1d0248821"

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
