FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                     file://0001-Add-OpenVG-demos-to-support-wayland.patch"

DEPENDS = "mesa"

PACKAGECONFIG_remove_mx6 = "${@base_contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)}"

PACKAGECONFIG[vg] = "--enable-vg,--disable-vg,virtual/libopenvg"

PACKAGECONFIG_append = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' wayland vg', '', d)}"
