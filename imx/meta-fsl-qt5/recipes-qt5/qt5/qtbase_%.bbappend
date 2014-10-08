
PACKAGECONFIG_GL_mx6sx = "gles2"
QT_CONFIG_FLAGS_append_mx6sx = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
