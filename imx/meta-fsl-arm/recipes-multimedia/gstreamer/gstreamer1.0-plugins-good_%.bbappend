
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://decrease_asteriskh263_rank.patch \
                   file://aacparse-Fix-aacparse-error-tolerance-issue.patch \
"

