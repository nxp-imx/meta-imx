FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Enable pango lib
PACKAGECONFIG_append = " pango "

SRC_URI_append = " file://0001-basetextoverlay-make-memory-copy-when-video-buffer-s.patch \
                   file://0002-gstplaysink-don-t-set-async-of-custom-text-sink-to-f.patch \
                   file://0007-taglist-not-send-to-down-stream-if-all-the-frame-cor.patch \
                   file://0008-handle-audio-video-decoder-error.patch \
                   file://0009-gstaudiobasesink-print-warning-istead-of-return-ERRO.patch \
                   file://0010-Disable-orc-optimization-for-lib-video-in-plugins-ba.patch \
"

PACKAGE_ARCH_mxs = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx5 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
