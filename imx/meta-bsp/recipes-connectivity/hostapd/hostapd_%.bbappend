# Disable hostapd service when system boot up
INITSCRIPT_NAME = ""

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://defconfig \
"
