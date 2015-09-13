
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-baseparse-handle-base-parse-error.patch \
                   file://0003-basesink-Shouldn-t-drop-buffer-when-sync-false.patch \
"

