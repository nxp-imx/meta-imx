FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"

SRC_URI_append = " file://0407-mulawdec-fix-integer-overrun.patch"

