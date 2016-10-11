FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-mesa-demos-OpenVG-demos-with-single-frame-need-eglSw.patch"

DEPENDS = "mesa"

REMOVE_GLU = "${@base_contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)}"
PACKAGECONFIG_remove_mx6q = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6dl = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sx = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sl = "${REMOVE_GLU}"

PACKAGECONFIG_append_mx6 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)}"
