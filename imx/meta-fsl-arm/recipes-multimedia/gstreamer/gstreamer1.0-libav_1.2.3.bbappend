
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://videodec-Don-t-use-non-growable-pool.patch"

