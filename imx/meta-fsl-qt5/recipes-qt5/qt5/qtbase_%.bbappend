
PACKAGECONFIG_remove_mx6sl = "gles2"

PACKAGECONFIG_GL_mx6sl = "${@base_contains('DISTRO_FEATURES', 'x11', \
                            ' gl', '', d)}"

QT_CONFIG_FLAGS_append_mx6sl = "${@base_contains('DISTRO_FEATURES', 'x11', \
                            '', ' -no-opengl -linuxfb -no-icu -no-eglfs', d)}"
