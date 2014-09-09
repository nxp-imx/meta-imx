
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
                   file://gstplaybin-enable-native-video.patch \
"

