FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS = "mesa"

REMOVE_GLU = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'glu x11', '', d)}"
PACKAGECONFIG_remove_mx6q = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6dl = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sx = "${REMOVE_GLU}"
PACKAGECONFIG_remove_mx6sl = "${REMOVE_GLU}"

PACKAGECONFIG_append_mx6 = " ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland vg', '', d)}"

PACKAGECONFIG[glut] = "--with-glut=${STAGING_EXECPREFIXDIR},--without-glut,freeglut"

PACKAGECONFIG_append_mx6 = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'glut', '', d)}"
