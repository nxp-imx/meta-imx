DEPENDS = "mesa"

PACKAGECONFIG[glut] = "--with-glut=${STAGING_EXECPREFIXDIR},--without-glut,freeglut"

PACKAGECONFIG_append_imxgpu2d = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'glut', '', d)}"
