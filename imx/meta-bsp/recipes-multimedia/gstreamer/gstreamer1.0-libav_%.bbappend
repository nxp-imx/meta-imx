FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0002-av-Cast-AVContext-bit_rate-to-a-guint-before-passing.patch \
"
