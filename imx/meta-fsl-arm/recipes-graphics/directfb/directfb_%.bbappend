
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://Check-input-NULL-pointer.patch"

EXTRA_OECONF += " --with-tests  \"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
