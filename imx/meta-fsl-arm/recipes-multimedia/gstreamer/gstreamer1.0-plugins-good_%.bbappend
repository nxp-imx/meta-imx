
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://aacparse-Fix-aacparse-error-tolerance-issue.patch \
"

