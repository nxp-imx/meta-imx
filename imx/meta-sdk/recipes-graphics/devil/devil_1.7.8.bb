DESCRIPTION = "A full featured cross-platform image library"
SECTION = "libs"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"
PR = "r0"

DEPENDS = "libpng jpeg"
RDEPENDS_${PN} += "libpng "

SRC_URI = "${FSL_MIRROR}/DevIL-${PV}.tar.gz \
		   file://il_manip_c.patch \
		   file://il_manip_h.patch \
		   file://M4Patch.patch "

SRC_URI[md5sum] = "7918f215524589435e5ec2e8736d5e1d"
SRC_URI[sha256sum] = "682ffa3fc894686156337b8ce473c954bf3f4fb0f3ecac159c73db632d28a8fd"

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
