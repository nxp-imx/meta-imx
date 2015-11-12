FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-mesa-demos-OpenVG-demos-with-single-frame-need-eglSw.patch"

DEPENDS = "mesa"

PACKAGECONFIG_remove_mx6 = "${@base_contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)}"

PACKAGECONFIG_append = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' wayland vg', '', d)}"
