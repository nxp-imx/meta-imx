FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://0001-CMakeLists.txt-GoogleTest-1.17.0-requires-at-least-C.patch"
