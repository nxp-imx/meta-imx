FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://do-not-change-eos-event-to-gap-event2.patch \
                   file://do-not-change-eos-event-to-gap-event3.patch \
                   file://taglist-not-send-to-down-stream-if-all-the-frame-cor.patch \
                   file://fix-id3demux-utf16-to-utf8-issue.patch \
                   file://video_bufferpool_set_buffer_size.patch \
                   file://handle-audio-video-decoder-error.patch \
                   file://videobuffer_updata_alignment_update.patch \
"

