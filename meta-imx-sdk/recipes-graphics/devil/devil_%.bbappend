FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-CMakeLists-Use-CMAKE_INSTALL_LIBDIR-for-install-libs.patch \
            file://0001-cmake-Update-cmake_minimum_required-to-3.5.patch"
