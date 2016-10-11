FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += "file://Fix-for-hostnamed-not-starting.patch"
