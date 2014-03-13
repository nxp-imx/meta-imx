# look for files in the layer first
FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = "file://alsa-lib-1.0.24-fix_s24_3le_downmix.patch "

