FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "file://Revert-udev-remove-userspace-firmware-loading-suppor.patch"
