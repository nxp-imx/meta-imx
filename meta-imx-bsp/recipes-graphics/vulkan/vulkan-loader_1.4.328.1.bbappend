FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-Fix-memory-leak.patch \
    file://0002-fix-call-DestroyInstance-after-loader_platform_close.patch"
