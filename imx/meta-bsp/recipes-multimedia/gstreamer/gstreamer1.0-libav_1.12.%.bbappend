FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0002-gstavcodecmap-Do-not-require-a-channel-mask.patch \
"
