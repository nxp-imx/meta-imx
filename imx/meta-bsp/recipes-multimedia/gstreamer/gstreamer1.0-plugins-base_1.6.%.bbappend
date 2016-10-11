FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


SRC_URI_append = " file://0001-basetextoverlay-make-memory-copy-when-video-buffer-s.patch \
                   file://0002-gstplaysink-don-t-set-async-of-custom-text-sink-to-f.patch \
                   file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
                   file://0004-subparse-set-need_segment-after-sink-pad-received-GS.patch \
                   file://0005-encodebin-Need-more-buffers-in-output-queue-for-bett.patch \
                   file://0006-ENGR00312515-get-caps-from-src-pad-when-query-caps.patch \
                   file://0007-taglist-not-send-to-down-stream-if-all-the-frame-cor.patch \
                   file://0008-handle-audio-video-decoder-error.patch \
                   file://0009-gstaudiobasesink-print-warning-istead-of-return-ERRO.patch \
                   file://0010-Disable-orc-optimization-for-lib-video-in-plugins-ba.patch \
                   file://0011-convertframe-Support-video-crop-when-convert-frame.patch \
                   file://0012-MMFMWK-7030-Linux_MX6QP_ARD-IMXCameraApp-When-Enable.patch \
"

# Enable pango lib
PACKAGECONFIG_append = " pango "

PACKAGE_ARCH_mxs = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx5 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
