FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0407-mulawdec-fix-integer-overrun.patch"

