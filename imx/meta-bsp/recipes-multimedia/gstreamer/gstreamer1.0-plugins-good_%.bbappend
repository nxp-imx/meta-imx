FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0002-Fix-aacpase-error-tolerance-issue.patch \
                   file://0003-Revert-pulsesink-uncork-if-needed-upon-commit.patch \
"

