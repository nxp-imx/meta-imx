# Append path for freescale layer to include bsp tslib fixes
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://tslib-1.0-enable_input_events.patch \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"