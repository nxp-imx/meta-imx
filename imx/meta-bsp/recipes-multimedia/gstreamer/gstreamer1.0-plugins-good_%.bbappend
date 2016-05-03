FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-gstrtpmp4gpay-set-dafault-value-for-MPEG4-without-co.patch \
                   file://0002-Need-to-check-if-pa-stream-is-still-valid.patch \
                   file://0003-Fix-aacpase-error-tolerance-issue.patch \
                   file://0005-ximageutil-shouldn-t-implement-transform-if-don-t-su.patch \
"

