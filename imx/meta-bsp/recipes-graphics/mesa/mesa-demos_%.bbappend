FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}:"

MESA-DEMO-PATCH = "file://0001-Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                   file://0001-Add-OpenVG-demos-to-support-wayland.patch \
                   file://Replace-glWindowPos2iARB-calls-with-glWindowPos2i.patch \
                   file://fix-clear-build-break.patch"


SRC_URI_append_mx6q  = " ${MESA-DEMO-PATCH}"
SRC_URI_append_mx6dl = " ${MESA-DEMO-PATCH}"
SRC_URI_append_mx6sx = " ${MESA-DEMO-PATCH}"
SRC_URI_append_mx6sl = " ${MESA-DEMO-PATCH}"

DEPENDS = "mesa"

REMOVE_GLU = "${@base_contains('DISTRO_FEATURES', 'x11', '', \
                base_contains('DISTRO_FEATURES', 'wayland', 'glu', '', d), d)}"

PACKAGECONFIG_remove_mx6q = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6dl = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sx = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sl = "gles1 gles2 ${REMOVE_GLU}"

PACKAGECONFIG[vg] = "--enable-vg,--disable-vg,virtual/libopenvg"

PACKAGECONFIG_append = "${@base_contains('DISTRO_FEATURES', 'x11', '', \
                base_contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d), d)}"
