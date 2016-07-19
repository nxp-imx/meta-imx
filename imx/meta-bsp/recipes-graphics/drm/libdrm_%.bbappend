FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx8 = " file://drm-update-arm.patch"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"
