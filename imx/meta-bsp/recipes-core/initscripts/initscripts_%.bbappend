# Append to remove /proc/cpu/aligntment from alignmnet script
FILESEXTRAPATHS_prepend := "${THISDIR}/arm:"

SRC_URI += "file://alignment.sh"

PACKAGE_ARCH = "${MACHINE_ARCH}"
