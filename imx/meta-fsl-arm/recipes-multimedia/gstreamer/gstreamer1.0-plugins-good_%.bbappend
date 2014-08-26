
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://rtpjitterbuffer_deadloop.patch \
                   file://decrease_asteriskh263_rank.patch \
"

