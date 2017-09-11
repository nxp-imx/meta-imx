FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-Need-to-check-if-pa-stream-is-still-valid.patch \
                   file://0002-Fix-aacpase-error-tolerance-issue.patch \
                   file://0003-MMFMWK-7274-mx8dv-Enable-camera-on-mx8dv.patch \
                   file://0004-gstaacparse-Fix-adif-aac-file-read-channel-progile-i.patch \
"
