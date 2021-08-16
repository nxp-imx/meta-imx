FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Use source package from CAF because of frequent fetch errors.
SRC_URI:remove = "http://sourceforge.net/projects/openil/files/DevIL/${PV}/DevIL-${PV}.zip"
SRC_URI:prepend = "https://source.codeaurora.org/mirrored_source/external/imx/DevIL-${PV}.zip "

SRC_URI += "file://0001-CMakeLists-Use-CMAKE_INSTALL_LIBDIR-for-install-libs.patch"
