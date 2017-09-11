FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS += " elfutils"

# Unrecognised options, need to remove them
EXTRA_OECONF_remove = " --disable-docbook --disable-trace"

SRC_URI_append = " file://0001-handle-base-parse-error.patch \
                   file://0002-Fix-crash-with-gst-inspect-Chris-Lord-chris-openedha.patch \
                   file://0003-baseparse-unset-FLAG_DISCONT-when-push-to-adapter.patch \
                   file://0004-gstbaseparse-Need-push-adapter-remainning-data-in-pa.patch \
                   file://0005-inputselector-should-proceed-non-active-pad-buffer-e.patch \
                   file://0006-poll-Add-check-if-can-read-event-API.patch \
                   file://0007-inputselector-Need-flush-when-set-active-pad-and-the.patch \
"
