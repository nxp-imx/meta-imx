FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx7ulp = " file://drm-update-arm.patch"
PACKAGE_ARCH_mx7ulp = "${MACHINE_SOCARCH}"
