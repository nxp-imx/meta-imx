FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


SRC_URI_append = " file://0005-Fix_alaw_mulaw_channel_position.patch \
"

# Enable pango lib
PACKAGECONFIG_append = " pango "

PACKAGE_ARCH_mxs = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx5 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
