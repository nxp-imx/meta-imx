FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Use source package from CAF because of frequent fetch errors.
SRC_URI:remove = "http://sourceforge.net/projects/openil/files/DevIL/${PV}/DevIL-${PV}.zip"
SRC_URI:prepend = "http://www.nxp.com/lgfiles/updates/other/DevIL-${PV}.zip "

SRC_URI += "file://0001-CMakeLists-Use-CMAKE_INSTALL_LIBDIR-for-install-libs.patch"
