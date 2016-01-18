
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-handle-base-parse-error.patch \
                   file://0003-baseparse-unset-FLAG_DISCONT-when-push-to-adapter.patch \
                   file://0004-gstbaseparse-Need-push-adapter-remainning-data-in-passthrough-mode.patch \
"

