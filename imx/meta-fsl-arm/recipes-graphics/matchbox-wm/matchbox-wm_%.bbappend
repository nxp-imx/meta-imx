
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://fix-close-button-do-not-response-to-multitouch.patch \
"
