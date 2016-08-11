FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 = " file://0001-mesa-demos-OpenVG-demos-with-single-frame-need-eglSw.patch"

# For now, the following patch in poky krogoth branch breaks the build.
# Remove it as a temporal workaround.
SRC_URI_remove = " file://0011-drop-demos-dependant-on-obsolete-MESA_screen_surface.patch \
"

DEPENDS = "mesa"

REMOVE_GLU = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)}"
PACKAGECONFIG_remove_mx6q = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6dl = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sx = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sl = "${REMOVE_GLU}"

PACKAGECONFIG_append_mx6 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)}"

PACKAGECONFIG[glut] = "--with-glut=${STAGING_EXECPREFIXDIR},--without-glut,freeglut"

PACKAGECONFIG_append_mx6 = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'glut', '', d)}"
