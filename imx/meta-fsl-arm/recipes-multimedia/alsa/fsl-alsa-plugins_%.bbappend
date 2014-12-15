# look for files in the layer first
FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-asrc_pair-update-output-buffer-size.patch \
"
