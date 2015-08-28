FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-Reuse-the-resurface-only-when-window-is-available.patch"

PACKAGECONFIG_append_mx6 = " accessibility examples"
