PACKAGECONFIG_append_mx6 = " accessibility examples"

QT_CONFIG_FLAGS_append = " -qpa ${@base_contains('DISTRO_FEATURES', 'x11', \
                              base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d), \
                                  base_contains('DISTRO_FEATURES', 'wayland', 'wayland', 'eglfs', d), d)}"

