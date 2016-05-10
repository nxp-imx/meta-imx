FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-mesa-demos-OpenVG-demos-with-single-frame-need-eglSw.patch"

SRC_URI_append_mx8 = " file://Replace-glWindowPos2iARB-calls-with-glWindowPos2i.patch \
                    file://fix-clear-build-break.patch \
                    file://Additional-eglSwapBuffer-calling-makes-wrong-throttl.patch \
                    file://Add-OpenVG-demos-to-support-wayland.patch \
                    file://0001-mesa-demos-OpenVG-demos-with-single-frame-need-eglSw.patch"

DEPENDS = "mesa"

REMOVE_GLU = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)}"
PACKAGECONFIG_remove_mx6q = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6dl = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sx = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sl = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx8 = "${REMOVE_GLU}"

PACKAGECONFIG_append_mx6 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)}"
PACKAGECONFIG_append_mx8 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)}"

PACKAGECONFIG[glut] = "--with-glut=${STAGING_EXECPREFIXDIR},--without-glut,mesa-glut"

PACKAGECONFIG_append_mx6 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'glut', '', d)}"
