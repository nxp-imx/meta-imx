
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-ENGR00312034-do-not-change-eos-event-to-gap-event-if.patch \
                   file://0001-ENGR00312515-get-caps-from-src-pad-when-query-caps.patch \
"

