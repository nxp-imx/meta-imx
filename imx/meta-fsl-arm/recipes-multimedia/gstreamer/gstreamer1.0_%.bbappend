
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-pass-rate-of-input-segment-to-output-segment.patch \
                   file://0001-PATCH-assure-percent-0-in-get_buffering_percent.patch \
"
