# OpenGL support currently seems tied to using libglu, which requires x11
PACKAGECONFIG = " \
    ${@bb.utils.contains_any('DISTRO_FEATURES', 'x11 wayland', 'gtk', 'no_gui', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'opengl', '', d)} \
"
