FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


SRC_URI_append = " file://do-not-change-eos-event-to-gap-event2.patch \
                   file://do-not-change-eos-event-to-gap-event3.patch \
                   file://fix-id3demux-utf16-to-utf8-issue.patch \
                   file://handle-audio-video-decoder-error.patch \
                   file://videobuffer_updata_alignment_update.patch \
                   file://0002-video-frame-Add-GST_VIDEO_FRAME_MAP_FLAG_NO_REF.patch \
                   file://0003-videofilter-Use-new-GST_VIDEO_FRAME_MAP_FLAG_NO_REF.patch \
                   file://0001-video-frame-Don-t-ref-buffers-twice-when-mapping.patch \
                   file://0001-basetextoverlay-make-memory-copy-when-video-buffer-s.patch \
                   file://0002-gstplaysink-don-t-set-async-of-custom-text-sink-to-f.patch \
                   file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
                   file://0004-subparse-set-need_segment-after-sink-pad-received-GS.patch \
                   file://gstplaybin-remove-flag-deinterlace.patch \
"

# Enable pango lib
PACKAGECONFIG_append = " pango "

PACKAGE_ARCH_mxs = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx5 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
