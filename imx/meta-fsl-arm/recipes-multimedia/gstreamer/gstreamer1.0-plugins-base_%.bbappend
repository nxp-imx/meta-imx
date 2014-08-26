
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
                   file://gstplaybin-enable-native-video.patch \
                   file://gsttvideodecoderbase-Haven-t-set-caps-to-downstream-.patch \
"

