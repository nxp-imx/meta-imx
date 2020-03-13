DESCRIPTION = "A full featured cross-platform image library"
SECTION = "libs"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"
PR = "r0"

DEPENDS = "libpng jpeg tiff xz"

SRC_URI = "http://sourceforge.net/projects/openil/files/DevIL/${PV}/DevIL-${PV}.zip \
    file://0001-CMakeLists-Use-CMAKE_INSTALL_LIBDIR-for-install-libs.patch"

SRC_URI[md5sum] = "ba77c3cb2aadaacfd86e23c68fb6dc47"
SRC_URI[sha256sum] = "451337f392c65bfb83698a781370534dc63d7bafca21e9b37178df0518f7e895"

S = "${WORKDIR}/DevIL/DevIL"

inherit cmake

TARGET_CFLAGS += "-Dpng_set_gray_1_2_4_to_8=png_set_expand_gray_1_2_4_to_8"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

PACKAGE_ARCH = "${MACHINE_ARCH}"
