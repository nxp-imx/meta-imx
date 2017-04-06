FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += "file://Fix-for-hostnamed-not-starting.patch \
                   file://Machine-system-ctl-always-pass-changes-and-n_changes.patch"
