DEPENDS += "libdrm"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-Fix-GCC-13-compiler-errors.patch;patchdir=src/3rdparty"
