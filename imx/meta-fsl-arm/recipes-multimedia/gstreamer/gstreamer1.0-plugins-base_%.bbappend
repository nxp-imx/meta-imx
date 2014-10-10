FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://do-not-change-eos-event-to-gap-event2.patch"

