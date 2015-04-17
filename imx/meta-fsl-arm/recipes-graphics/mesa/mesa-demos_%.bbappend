# look for files in the layer first
FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                       file://0001-Add-OpenVG-demos-to-support-wayland.patch"

REMOVE_GLU = "${@base_contains('DISTRO_FEATURES', 'x11', '', \
                base_contains('DISTRO_FEATURES', 'wayland', 'glu', '', d), d)}"

PACKAGECONFIG_remove = "${REMOVE_GLU}"

PACKAGECONFIG[vg] = "--enable-vg,--disable-vg,virtual/libopenvg"

PACKAGECONFIG_append = "${@base_contains('DISTRO_FEATURES', 'x11', '', \
                base_contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d), d)}"
