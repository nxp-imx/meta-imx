FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0002-Need-to-check-if-pa-stream-is-still-valid.patch \
                   file://0003-Fix-aacpase-error-tolerance-issue.patch \
                   file://0004-mx8dv-Enable-camera-on-mx8dv.patch \
                   file://0005-wavparse-Don-t-set-caps-to-NULL-after-setting-them-o.patch \
"

