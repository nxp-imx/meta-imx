
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://do-not-change-eos-event-to-gap-event-if.patch \
                   file://get-caps-from-src-pad-when-query-caps.patch \
                   file://gstplaybin-enable-native-video.patch \
                   file://fix-memory-leak-of-gstplaybin2.patch \
                   file://do-not-change-eos-event-to-gap-event2.patch \
                   file://do-not-change-eos-event-to-gap-event3.patch \
                   file://taglist-not-send-to-down-stream-if-all-the-frame-cor.patch \
"

