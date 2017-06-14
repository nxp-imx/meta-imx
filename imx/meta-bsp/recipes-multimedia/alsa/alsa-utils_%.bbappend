FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "file://0001-aplay-Introduce-and-use-xwrite-helper.patch"
