
# only include this change for X11 backend

FILESEXTRAPATHS_prepend_mx6 := "${@base_contains('DISTRO_FEATURES', 'x11', '${THISDIR}/${PN}:', '', d)}"

SRC_URI = "file://rc.local.etc \
	  file://rc.local.init \
           file://LICENSE"

