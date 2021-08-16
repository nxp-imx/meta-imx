# Append to remove /proc/cpu/aligntment from alignmnet script
FILESEXTRAPATHS:prepend := "${THISDIR}/arm:"

SRC_URI:append:imx = " file://alignment.sh "

PACKAGE_ARCH = "${MACHINE_ARCH}"
